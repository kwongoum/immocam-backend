package be.wkam.immocam.services;

import be.wkam.immocam.entities.User;
import be.wkam.immocam.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  IGenericService<User, Long>{

        @Autowired
        private UserRepository userRepository;
    @Override
    public User save(User user) {
        return userRepository.save( user);
    }

    @Override
    public List<User> list() {
        return  userRepository.findAll();
    }

    @Override
    public User get(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User update(User user, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {
        
    }
}
