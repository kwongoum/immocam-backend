package be.wkam.immocam.services;

import be.wkam.immocam.entities.Town;
import be.wkam.immocam.repositories.TownRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TownServiceImpl implements  TownService{

        @Autowired
        private TownRepository townRepository;


    @Override
    public Town saveTown(Town town) {
        return townRepository.save(town);
    }

    @Override
    public List<Town> listTown() {
        return townRepository.findAll();
    }

    @Override
    public Town getTown(Long id) {
        return townRepository.findById(id).orElse(null);
    }
}
