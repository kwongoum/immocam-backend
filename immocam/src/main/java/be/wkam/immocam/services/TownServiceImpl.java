package be.wkam.immocam.services;

import be.wkam.immocam.entities.Town;
import be.wkam.immocam.repositories.TownRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TownServiceImpl implements  IGenericService<Town,Long>{

        @Autowired
        private TownRepository townRepository;


    @Override
    public Town save(Town town) {
        return townRepository.save(town);
    }

    @Override
    public List<Town> list() {
        return townRepository.findAll();
    }

    @Override
    public Town get(Long id) {
        return townRepository.findById(id).orElse(null);
    }

    @Override
    public Town update(Town town, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

}
