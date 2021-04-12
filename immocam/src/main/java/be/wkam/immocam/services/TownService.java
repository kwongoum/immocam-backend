package be.wkam.immocam.services;

import be.wkam.immocam.entities.Town;
import be.wkam.immocam.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TownService {
      public Town saveTown(Town town);
      public List<Town> listTown();
      public Town getTown(Long id );

}
