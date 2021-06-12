package be.wkam.immocam.services;

import be.wkam.immocam.entities.PasswordReset;
import be.wkam.immocam.entities.User;
import be.wkam.immocam.repositories.PasswordResetRepository;
import be.wkam.immocam.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasswordResetServiceImpl implements  IGenericService<PasswordReset, Long>{

        @Autowired
        private PasswordResetRepository passwordResetRepository;


    @Override
    public PasswordReset save(PasswordReset passwordReset) {
        return  passwordResetRepository.save(passwordReset);
    }

    @Override
    public List<PasswordReset> list() {
        return passwordResetRepository.findAll();
    }

    @Override
    public PasswordReset get(Long id) {
        return  passwordResetRepository.findById(id).orElse(null);
    }

   public PasswordReset update(PasswordReset passwordReset, Long id){
         return null;
   }

    public void delete (Long id){}
}
