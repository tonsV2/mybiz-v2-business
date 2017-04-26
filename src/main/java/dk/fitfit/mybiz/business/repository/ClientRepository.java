package dk.fitfit.mybiz.business.repository;

import dk.fitfit.mybiz.business.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
