package dk.fitfit.mybiz.business.service;

import dk.fitfit.mybiz.business.domain.Role;
import dk.fitfit.mybiz.business.domain.User;
import dk.fitfit.mybiz.business.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserService extends CrudService<User, Long> implements UserServiceInterface, UserDetailsService {
	UserService(JpaRepository<User, Long> repository) {
		super(repository);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = ((UserRepository) repository).findByUsername(username);

		Collection<Role> roles = user.getRoles();
		Set<GrantedAuthority> authorities = roles
				.stream()
				.map(role -> (GrantedAuthority) role::getName)
				.collect(Collectors.toSet());

		return new org.springframework.security.core.userdetails.User(user.getUsername(),
				user.getPassword(),
				true,
				true,
				true,
				true,
				authorities);
	}

	@Override
	public User save(String username, String password, String email) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(passwordEncoder().encode(password));
		user.setEmail(email);
		return save(user);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
