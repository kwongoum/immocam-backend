package be.wkam.immocam.services;

import be.wkam.immocam.entities.Realty;
import be.wkam.immocam.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RealtyService {

    public  Realty saveReally(Realty realty); //C
    public List<Realty> listRealty();     //R all
    public Realty getRealty(Long id); // R  single


}
