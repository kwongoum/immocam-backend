package be.wkam.immocam.repositories;

import be.wkam.immocam.entities.Town;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TownRepository extends JpaRepository<Town,Long> {
}
