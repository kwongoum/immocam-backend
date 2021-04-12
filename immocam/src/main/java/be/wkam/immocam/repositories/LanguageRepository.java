package be.wkam.immocam.repositories;

import be.wkam.immocam.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language,Long> {
}
