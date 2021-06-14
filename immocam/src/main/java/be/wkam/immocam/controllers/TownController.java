package be.wkam.immocam.controllers;

import be.wkam.immocam.entities.Town;
import be.wkam.immocam.services.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class TownController {


    @Autowired
    private IGenericService<Town,Long> townService;

    @RequestMapping( value ="/town", method = RequestMethod.POST)
    public Town saveTown(Town town) {
        return townService.save(town);
    }

        @RequestMapping(value = "/towns", method =RequestMethod.GET )
      public Collection<Town> listTown(){
        return  townService.list();
      }


}
