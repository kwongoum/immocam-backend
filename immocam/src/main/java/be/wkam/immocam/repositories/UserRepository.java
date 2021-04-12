package be.wkam.immocam.repositories;

import be.wkam.immocam.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface UserRepository  extends JpaRepository<User,Long>{

}
