package be.wkam.immocam.controllers;

import be.wkam.immocam.entities.Role;
import be.wkam.immocam.entities.User;
import be.wkam.immocam.services.RoleService;
import be.wkam.immocam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping( value ="/role", method = RequestMethod.POST)
    public Role saveUser(Role role) {
        return roleService.saveRole(role);
    }

        @RequestMapping(name = "/roles", method =RequestMethod.GET )
      public List<Role> listRole(){
        return  roleService.listRole();
      }



}
