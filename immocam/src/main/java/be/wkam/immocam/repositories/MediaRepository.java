package be.wkam.immocam.repositories;

import be.wkam.immocam.entities.Media;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaRepository  extends JpaRepository<Media,Long> {
}
