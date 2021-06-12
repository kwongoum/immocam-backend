package be.wkam.immocam.services;

import be.wkam.immocam.entities.Group;
import be.wkam.immocam.entities.User;
import be.wkam.immocam.repositories.GroupRepository;
import be.wkam.immocam.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements  IGenericService<Group, Long>{

    @Autowired
    GroupRepository groupRepository;

       @Override
    public Group save(Group group){
           return groupRepository.save(group);
       }
 @Override
    public List<Group> list(){
            return groupRepository.findAll();
 }
   @Override
     public Group get(Long id){
            return groupRepository.findById(id).orElse(null);
   }
    @Override
    public  Group update(Group group, Long id){
            return  null;
    }
    @Override
     public  void delete(Long id){}
}
