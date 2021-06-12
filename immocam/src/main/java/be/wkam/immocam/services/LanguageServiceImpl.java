package be.wkam.immocam.services;

import be.wkam.immocam.entities.Language;
import be.wkam.immocam.entities.User;
import be.wkam.immocam.repositories.LanguageRepository;
import be.wkam.immocam.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements IGenericService<Language,Long>{

    @Autowired
      private LanguageRepository languageRepository;

     public Language save(Language language){
          return  languageRepository.save(language);
     }
      public List<Language> list(){
          return languageRepository.findAll();
      }
      public Language get(Long id){
          return languageRepository.findById(id).orElse(null);
      }
     public Language update(Language language, Long id){
          return null;
     }
      public void delete(Long id){}
}
