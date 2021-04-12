package be.wkam.immocam.services;

import be.wkam.immocam.entities.PasswordReset;
import be.wkam.immocam.entities.User;
import be.wkam.immocam.repositories.PasswordResetRepository;
import be.wkam.immocam.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasswordResetServiceImpl implements  PasswordResetService{

        @Autowired
        private PasswordResetRepository passwordResetRepository;


    @Override
    public PasswordReset savePasswordReset(PasswordReset passwordReset) {
        return  passwordResetRepository.save(passwordReset);
    }

    @Override
    public List<PasswordReset> listPermission() {
        return passwordResetRepository.findAll();
    }

    @Override
    public PasswordReset getPermission(Long id) {
        return  passwordResetRepository.findById(id).orElse(null);
    }
}
