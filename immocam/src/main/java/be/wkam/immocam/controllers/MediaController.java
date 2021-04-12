package be.wkam.immocam.controllers;

import be.wkam.immocam.entities.User;
import be.wkam.immocam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MediaController {
@Autowired
    private UserService userService;

    @RequestMapping( value ="/user", method = RequestMethod.POST)
    public User saveUser(User user) {
        return userService.saveUser(user);
    }

        @RequestMapping(name = "/users", method =RequestMethod.GET )
      public List<User> listUsers(){
        return  userService.listUser();
      }



}
