package be.wkam.immocam.repositories;

import be.wkam.immocam.entities.Realty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RealtyRepository extends JpaRepository<Realty,Long> {
}
