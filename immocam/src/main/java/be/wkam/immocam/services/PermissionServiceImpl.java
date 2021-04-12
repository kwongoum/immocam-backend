package be.wkam.immocam.services;

import be.wkam.immocam.entities.Permission;
import be.wkam.immocam.entities.User;
import be.wkam.immocam.repositories.PermissionRepository;
import be.wkam.immocam.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements  PermissionService{

        @Autowired
        private PermissionRepository permissionRepository;

    @Override
    public Permission savePermission(Permission permission) {
        return  permissionRepository.save(permission);
    }

    @Override
    public List<Permission> listPermission() {
        return permissionRepository.findAll();
    }

    @Override
    public Permission getPermission(Long id) {
        return permissionRepository.findById(id).orElse(null);
    }
}
