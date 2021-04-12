package be.wkam.immocam.repositories;

import be.wkam.immocam.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository  extends JpaRepository<Role,Long> {
}
