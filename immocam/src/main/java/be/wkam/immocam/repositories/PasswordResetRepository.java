package be.wkam.immocam.repositories;

import be.wkam.immocam.entities.PasswordReset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasswordResetRepository extends JpaRepository<PasswordReset,Long> {
}
