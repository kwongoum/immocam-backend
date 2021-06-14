package be.wkam.immocam.controllers;

import be.wkam.immocam.entities.Language;
import be.wkam.immocam.entities.User;
import be.wkam.immocam.services.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class LanguageController {
@Autowired
    private IGenericService<Language,Long> languageService;

    @RequestMapping( value ="/language", method = RequestMethod.POST)
    public Language saveLanguage(Language language) {
        return languageService.save(language);
    }

     //   @RequestMapping(name = "/languages", method =RequestMethod.GET )
     // public List<Language> listLanguage(){
       // return languageService.list();
      //}

}
