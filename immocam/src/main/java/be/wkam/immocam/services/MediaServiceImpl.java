package be.wkam.immocam.services;

import be.wkam.immocam.entities.Media;
import be.wkam.immocam.repositories.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MediaServiceImpl implements  IGenericService<Media, Long>{

        @Autowired
        private MediaRepository mediaRepository;

    @Override
    public Media save(Media media) {
        return  mediaRepository.save(media);
    }

    @Override
    public List<Media> list() {
        return  mediaRepository.findAll();
    }

    @Override
    public Media get(Long id) {
        return  mediaRepository.findById(id).orElse(null);
    }
    @Override
    public Media update(Media media, Long id){
        return  null;
    }
     @Override
    public void delete(Long id){

     }
}
