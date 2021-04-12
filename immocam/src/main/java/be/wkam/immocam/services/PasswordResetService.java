package be.wkam.immocam.services;

import be.wkam.immocam.entities.PasswordReset;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PasswordResetService {

    public PasswordReset savePasswordReset(PasswordReset passwordReset); //C
    public List<PasswordReset> listPermission();     //R all
    public PasswordReset getPermission(Long id); // R  single
}
