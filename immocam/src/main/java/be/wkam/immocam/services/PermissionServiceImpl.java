package be.wkam.immocam.services;

import be.wkam.immocam.entities.Permission;
import be.wkam.immocam.entities.User;
import be.wkam.immocam.repositories.PermissionRepository;
import be.wkam.immocam.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ScheduledExecutorTask;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Service
public class PermissionServiceImpl implements  IGenericService<Permission, Long>{

        @Autowired
        private PermissionRepository permissionRepository;

    @Override
    public Permission save(Permission permission) {
        return  permissionRepository.save(permission);
    }

    @Override
    public List<Permission> list() {
       return   permissionRepository.findAll();
    }

    @Override
    public Permission get(Long id) {
        return permissionRepository.findById(id).orElse(null);
    }
     @Override
    public Permission update (Permission permission, Long id){
         return  null;
     }
 public void delete(Long id){

 }
}
