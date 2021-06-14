package be.wkam.immocam.controllers;

import be.wkam.immocam.entities.Media;
import be.wkam.immocam.entities.User;
import be.wkam.immocam.services.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MediaController {

    @Autowired
    private IGenericService<Media,Long> mediaService;

    @RequestMapping( value ="/media", method = RequestMethod.POST)
    public  Media saveMedia(Media media) {
        return  mediaService.save(media);
    }

        @RequestMapping(value= "/medias", method =RequestMethod.GET )
      public List<Media> listMedias(){
        return mediaService.list();
      }



}
