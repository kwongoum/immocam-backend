package be.wkam.immocam.services;

import be.wkam.immocam.entities.Country;
import be.wkam.immocam.entities.User;
import be.wkam.immocam.repositories.CountryRepository;
import be.wkam.immocam.repositories.UserRepository;
import com.sun.el.lang.ELArithmetic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements IGenericService<Country, Long>{

        @Autowired
      CountryRepository countryRepository;
        @Override
         public Country save(Country country){
              return countryRepository.save(country);
         }
    @Override
    public  List<Country> list(){
            return countryRepository.findAll();
    }
     @Override
     public Country get(Long id){
             return  countryRepository.findById(id).orElse(null);
     }
     @Override
    public Country update(Country country, Long id){
             return  null;
     }
      @Override
      //   id= country.geId()
     public  void delete( Long id){

      }
}
