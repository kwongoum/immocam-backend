package be.wkam.immocam.controllers;

import be.wkam.immocam.entities.Town;
import be.wkam.immocam.entities.User;
import be.wkam.immocam.services.TownService;
import be.wkam.immocam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TownController {
@Autowired
    private TownService townService;

    @RequestMapping( value ="/town", method = RequestMethod.POST)
    public Town saveTown(Town town) {
        return townService.saveTown(town);
    }

        @RequestMapping(name = "/towns", method =RequestMethod.GET )
      public List<Town> listTown(){
        return  townService.listTown();
      }



}
