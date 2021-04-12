package be.wkam.immocam.services;

import be.wkam.immocam.entities.Language;
import be.wkam.immocam.entities.User;
import be.wkam.immocam.repositories.LanguageRepository;
import be.wkam.immocam.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService{

        @Autowired
        private LanguageRepository languageRepository;


    @Override
    public Language saveMediaType(Language language) {
        return  languageRepository.save(language);
    }

    @Override
    public List<Language> listLanguage() {
        return  languageRepository.findAll();
    }

    @Override
    public Language getLanguage(Long id) {
        return  languageRepository.findById(id).orElse(null);
    }
}
