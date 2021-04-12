package be.wkam.immocam.controllers;

import be.wkam.immocam.entities.Realty;
import be.wkam.immocam.entities.User;
import be.wkam.immocam.services.RealtyService;
import be.wkam.immocam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RealtyController {
@Autowired
    private RealtyService realtyService;

    @RequestMapping( value ="/realty", method = RequestMethod.POST)
    public Realty saveRealty(Realty realty) {
        return realtyService.saveReally(realty);
    }

        @RequestMapping(name = "/realties", method =RequestMethod.GET )
      public List<Realty> listRealty(){
        return   realtyService.listRealty();
      }



}
