package be.wkam.immocam.services;

import be.wkam.immocam.entities.Realty;
import be.wkam.immocam.entities.User;


import be.wkam.immocam.repositories.RealtyRepository;
import be.wkam.immocam.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RealtyServiceImpl implements  RealtyService{

        @Autowired
        private RealtyRepository realtyRepository;

    @Override
    public Realty saveReally(Realty realty) {
        return  realtyRepository.save(realty);
    }

    @Override
    public List<Realty> listRealty() {
        return  realtyRepository.findAll();
    }

    @Override
    public Realty getRealty(Long id) {
        return realtyRepository.findById(id).orElse(null);
    }
}
