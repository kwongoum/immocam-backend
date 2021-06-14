package be.wkam.immocam.controllers;

import be.wkam.immocam.entities.Realty;
import be.wkam.immocam.services.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class RealtyController {
@Autowired
    private IGenericService<Realty,Long> realtyService;

    @RequestMapping( value ="/realty", method = RequestMethod.POST)
    public Realty saveRealty(Realty realty) {
        return realtyService.save(realty);
    }

        @RequestMapping(value = "/realties", method =RequestMethod.GET )
      public Collection<Realty> listRealty(){
        return   realtyService.list();
      }



}
