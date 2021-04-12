package be.wkam.immocam.services;

import be.wkam.immocam.entities.Country;
import be.wkam.immocam.entities.Language;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CountryService {


    public Country saveCountry(Country country); //C
    public List<Country> listCountry();     //R all
    public Country getCountry(Long id); // R  single
}
