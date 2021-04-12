package be.wkam.immocam.services;

import be.wkam.immocam.entities.Permission;
import be.wkam.immocam.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PermissionService {

    public Permission savePermission(Permission permission); //C
    public List<Permission> listPermission();     //R all
    public Permission getPermission(Long id); // R  single
}
