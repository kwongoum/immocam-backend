package be.wkam.immocam.controllers;

import be.wkam.immocam.entities.Group;

import be.wkam.immocam.services.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GroupController {

     @Autowired
    private IGenericService<Group,Long> groupService;

     @RequestMapping(value = "/group", method = RequestMethod.POST)
            Group  saveGroup(Group group){
                 return groupService.save(group);
             }


    // @RequestMapping(name = "/groups", method =RequestMethod.GET)
    //Collection<Group> listGroup (){
     //     return  groupService.list();
    //}

}
