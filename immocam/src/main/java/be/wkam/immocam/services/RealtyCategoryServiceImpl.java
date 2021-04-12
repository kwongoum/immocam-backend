package be.wkam.immocam.services;

import be.wkam.immocam.entities.RealtyCategory;
import be.wkam.immocam.entities.User;
import be.wkam.immocam.repositories.RealtyCategoryRepository;
import be.wkam.immocam.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RealtyCategoryServiceImpl implements  RealtyCategoryService{

        @Autowired
        private RealtyCategoryRepository realtyCategoryRepository;


    @Override
    public RealtyCategory saveRealtyCategory(RealtyCategory realtyCategory) {
        return  realtyCategoryRepository.save(realtyCategory);
    }

    @Override
    public List<RealtyCategory> listRealtyCategory() {
        return realtyCategoryRepository.findAll();
    }

    @Override
    public RealtyCategory getRealtyCategory(Long id) {
        return realtyCategoryRepository.findById(id).orElse(null);
    }
}
