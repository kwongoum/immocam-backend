package be.wkam.immocam.services;

import be.wkam.immocam.entities.Role;
import be.wkam.immocam.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements   IGenericService<Role,Long>{

        @Autowired
        private RoleRepository roleRepository;

    @Override
    public Role save(Role role) {
        return  roleRepository.save(role);
    }

    @Override
    public List<Role> list() {
        return  roleRepository.findAll();
    }

    @Override
    public Role get(Long id) {
        return  roleRepository.findById(id).orElse(null);
    }
     @Override
  public  Role update (Role role, Long id) {
         return null;
     }

        @Override
        public void delete(Long id){

      }

}
