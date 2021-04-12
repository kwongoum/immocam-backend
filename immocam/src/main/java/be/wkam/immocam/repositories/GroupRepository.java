package be.wkam.immocam.repositories;

import be.wkam.immocam.entities.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group,Long> {
}
