package be.wkam.immocam.repositories;

import be.wkam.immocam.entities.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission,Long> {
}
