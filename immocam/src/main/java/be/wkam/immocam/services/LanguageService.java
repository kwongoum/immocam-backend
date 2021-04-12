package be.wkam.immocam.services;

import be.wkam.immocam.entities.Language;
import be.wkam.immocam.entities.MediaType;
import be.wkam.immocam.entities.MediaType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LanguageService {


    public Language saveMediaType(Language language); //C
    public List<Language> listLanguage();     //R all
    public Language getLanguage(Long id); // R  single
}
