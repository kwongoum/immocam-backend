package be.wkam.immocam.services;

import be.wkam.immocam.entities.Media;
import be.wkam.immocam.repositories.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MediaServiceImpl implements  MediaService{

        @Autowired
        private MediaRepository mediaRepository;

    @Override
    public Media saveMediaType(Media media) {
        return  mediaRepository.save(media);
    }

    @Override
    public List<Media> listMediaType() {
        return  mediaRepository.findAll();
    }

    @Override
    public Media getMediaType(Long id) {
        return mediaRepository.findById(id).orElse(null);
    }
}
