package be.wkam.immocam.services;

import be.wkam.immocam.entities.RealtyCategory;
import be.wkam.immocam.entities.User;
import be.wkam.immocam.repositories.RealtyCategoryRepository;
import be.wkam.immocam.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RealtyCategoryServiceImpl implements  IGenericService<RealtyCategory,Long>{

        @Autowired
        private RealtyCategoryRepository realtyCategoryRepository;


    @Override
    public RealtyCategory save(RealtyCategory realtyCategory) {
        return  realtyCategoryRepository.save(realtyCategory);
    }

    @Override
    public List<RealtyCategory> list() {
        return realtyCategoryRepository.findAll();
    }

    @Override
    public RealtyCategory get(Long id) {
        return realtyCategoryRepository.findById(id).orElse(null);
    }
    public RealtyCategory update(RealtyCategory realtyCategory, Long id){
        return null;
    }
    public void delete(Long id){

    }
}
