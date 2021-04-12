package be.wkam.immocam.services;

import be.wkam.immocam.entities.Media;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MediaService {


    public Media saveMediaType(Media media); //C
    public List<Media> listMediaType();     //R all
    public Media getMediaType(Long id); // R  single
}
