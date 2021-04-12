package be.wkam.immocam.repositories;

import be.wkam.immocam.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  CountryRepository extends JpaRepository<Country, Long> {

}
