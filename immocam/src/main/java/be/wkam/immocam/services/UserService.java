package be.wkam.immocam.services;

import be.wkam.immocam.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public  User saveUser(User user); //C
    public List<User> listUser();     //R all
    public User getUser(Long id); // R  single

}
