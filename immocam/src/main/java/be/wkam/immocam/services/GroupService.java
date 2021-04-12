package be.wkam.immocam.services;

import be.wkam.immocam.entities.Group;
import be.wkam.immocam.entities.Language;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GroupService {


    public Group saveGroup(Group group); //C
    public List<Group> listGroup();     //R all
    public Group getGroup(Long id); // R  single
}
