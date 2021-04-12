package be.wkam.immocam.repositories;

import be.wkam.immocam.entities.Realty;
import be.wkam.immocam.entities.RealtyCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RealtyCategoryRepository extends JpaRepository<RealtyCategory,Long> {
}
