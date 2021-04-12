package be.wkam.immocam.services;

import be.wkam.immocam.entities.MediaType;
import be.wkam.immocam.repositories.MediaTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaTypeServiceImpl implements  MediaTypeService{

        @Autowired
        private MediaTypeRepository mediaRepository;


    @Override
    public MediaType saveMediaType(MediaType mediaType) {
        return  mediaRepository.save(mediaType);
    }

    @Override
    public List<MediaType> listMediaType() {
        return mediaRepository.findAll();
    }

    @Override
    public MediaType getMediaType(Long id) {
        return mediaRepository.findById(id).orElse(null);
    }
}
