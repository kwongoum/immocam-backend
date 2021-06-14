package be.wkam.immocam.controllers;

import be.wkam.immocam.entities.Role;
import be.wkam.immocam.services.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    private IGenericService<Role,Long> roleService;

    @RequestMapping( value ="/role", method = RequestMethod.POST)
    public Role saveUser(Role role) {
        return roleService.save(role);
    }

        @RequestMapping(value= "/roles", method =RequestMethod.GET )
      public List<Role> listRole(){
        return (List<Role>) roleService.list();
      }



}
