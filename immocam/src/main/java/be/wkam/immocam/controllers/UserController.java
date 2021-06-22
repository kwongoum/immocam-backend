package be.wkam.immocam.controllers;

import be.wkam.immocam.entities.User;
import be.wkam.immocam.services.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    
    @Autowired
    private IGenericService<User,Long> userService;

    @RequestMapping( value ="/user", method = RequestMethod.POST)
    public User saveUser(User user) {
        return userService.save(user);
    }

        @RequestMapping(value = "/users", method =RequestMethod.GET )
      public List<User> listUser(){

        return (List<User>) userService.list();
      }


}
