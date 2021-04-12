package be.wkam.immocam.services;

import be.wkam.immocam.entities.RealtyCategory;
import be.wkam.immocam.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RealtyCategoryService {

    public RealtyCategory saveRealtyCategory(RealtyCategory realtyCategory); //C
    public List<RealtyCategory> listRealtyCategory();     //R all
    public RealtyCategory getRealtyCategory(Long id); // R  single
}
