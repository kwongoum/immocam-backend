package be.wkam.immocam.services;

import be.wkam.immocam.entities.Role;
import be.wkam.immocam.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements  RoleService{

        @Autowired
        private RoleRepository roleRepository;

    @Override
    public Role saveRole(Role role) {
        return  roleRepository.save(role);
    }

    @Override
    public List<Role> listRole() {
        return  roleRepository.findAll();
    }

    @Override
    public Role getRole(Long id) {
        return  roleRepository.findById(id).orElse(null);
    }



}
