package be.wkam.immocam.controllers;

import be.wkam.immocam.entities.Permission;
import be.wkam.immocam.services.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class PermissionController {
@Autowired
    private IGenericService<Permission,Long> permissionService;

    @RequestMapping( value ="/permission", method = RequestMethod.POST)
    public Permission savePermission(Permission permission) {
        return  permissionService.save(permission);
    }

        @RequestMapping(value= "/permissions", method =RequestMethod.GET )
      public Collection<Permission> listPermissions(){
        return   permissionService.list();
      }



}
