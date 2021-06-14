package be.wkam.immocam.controllers;

import be.wkam.immocam.entities.Language;
import be.wkam.immocam.entities.Media;
import be.wkam.immocam.entities.MediaType;
import be.wkam.immocam.services.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MediaTypeController {

    @Autowired
 private IGenericService<MediaType, Long> mediaTypeService;

    @RequestMapping(value = "/mediaTYpe", method = RequestMethod.POST)
    public MediaType saveMediaType(MediaType mediaType){

            return mediaTypeService.save(mediaType);
               }

    public List<MediaType>  listMediaType(){
         return (List<MediaType>) mediaTypeService.list();
    }
}
