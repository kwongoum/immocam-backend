package be.wkam.immocam.services;

import be.wkam.immocam.entities.MediaType;
import be.wkam.immocam.repositories.MediaTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaTypeServiceImpl implements  IGenericService<MediaType, Long>{

        @Autowired
        private MediaTypeRepository mediaRepository;


    @Override
    public MediaType save(MediaType mediaType) {
        return  mediaRepository.save(mediaType);
    }

    @Override
    public List<MediaType> list() {
        return mediaRepository.findAll();
    }

    @Override
    public MediaType get(Long id) {
        return mediaRepository.findById(id).orElse(null);
    }

   @Override
    public MediaType update( MediaType mediaType, Long id){
         return null;
   }
    public void delete(Long id ){}

}
