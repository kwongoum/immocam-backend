package be.wkam.immocam.services;

import be.wkam.immocam.entities.Country;
import be.wkam.immocam.entities.User;
import be.wkam.immocam.repositories.CountryRepository;
import be.wkam.immocam.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService{

        @Autowired
        private CountryRepository countryRepository;

    @Override
    public Country saveCountry(Country country) {
        return  countryRepository.save(country);
    }

    @Override
    public List<Country> listCountry() {
        return countryRepository.findAll();
    }

    @Override
    public Country getCountry(Long id) {
        return countryRepository.findById(id).orElse(null);
    }
}
