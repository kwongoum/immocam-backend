package be.wkam.immocam.controllers;

import be.wkam.immocam.entities.Country;
import be.wkam.immocam.entities.User;
import be.wkam.immocam.services.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
@Autowired
    private IGenericService<Country,Long>  countryService;

    @RequestMapping( value="/country", method = RequestMethod.POST)
    public  Country saveCountry(Country country) {
        return  countryService.save(country);
    }

        @RequestMapping(value= "/countries", method =RequestMethod.GET )
      public List<Country> listCountry(){

        return countryService.list();
      }




}
