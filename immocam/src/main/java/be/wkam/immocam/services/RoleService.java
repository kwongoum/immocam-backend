package be.wkam.immocam.services;

import be.wkam.immocam.entities.Role;
import be.wkam.immocam.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {
    public  Role saveRole(Role  role); //C
    public List<Role> listRole();   //R all
    public Role  getRole(Long id); // R  single

}
