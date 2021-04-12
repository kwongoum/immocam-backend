package be.wkam.immocam.repositories;

import be.wkam.immocam.entities.MediaType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaTypeRepository extends JpaRepository<MediaType,Long> {
}
