package be.wkam.immocam.services;

import be.wkam.immocam.entities.Group;
import be.wkam.immocam.entities.User;
import be.wkam.immocam.repositories.GroupRepository;
import be.wkam.immocam.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements  GroupService{

        @Autowired
        private GroupRepository groupRepository;


    @Override
    public Group saveGroup(Group group) {
        return groupRepository.save(group);
    }

    @Override
    public List<Group> listGroup() {
        return  groupRepository.findAll();
    }

    @Override
    public Group getGroup(Long id) {
        return groupRepository.findById(id).orElse(null);
    }
}
