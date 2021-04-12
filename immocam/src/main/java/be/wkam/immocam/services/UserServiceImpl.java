package be.wkam.immocam.services;

import be.wkam.immocam.entities.User;
import be.wkam.immocam.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService{

        @Autowired
        private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        return userRepository.save( user);
    }

    @Override
    public List<User> listUser() {
        return  userRepository.findAll();
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
