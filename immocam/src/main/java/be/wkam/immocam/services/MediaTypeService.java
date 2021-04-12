package be.wkam.immocam.services;

import be.wkam.immocam.entities.MediaType;
import be.wkam.immocam.entities.PasswordReset;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MediaTypeService {

    public MediaType saveMediaType(MediaType mediaType); //C
    public List<MediaType> listMediaType();     //R all
    public MediaType getMediaType(Long id); // R  single
}
