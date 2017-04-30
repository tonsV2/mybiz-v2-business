package dk.fitfit.mybiz.business.repository;

import dk.fitfit.mybiz.business.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
