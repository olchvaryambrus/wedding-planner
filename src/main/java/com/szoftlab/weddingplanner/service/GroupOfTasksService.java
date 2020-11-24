package com.szoftlab.weddingplanner.service;

import com.szoftlab.weddingplanner.model.GroupOfTasks;
import com.szoftlab.weddingplanner.repository.GroupOfTasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupOfTasksService {

    private GroupOfTasksRepository repository;

    @Autowired
    public GroupOfTasksService(GroupOfTasksRepository groupOfTasksRepository){ this.repository = groupOfTasksRepository; }

    public List<GroupOfTasks> findAll(){
        return repository.findAll();
    }


    public Optional<GroupOfTasks> findById(Long Id){
        return repository.findById(Id);
    }


    public GroupOfTasks save(GroupOfTasks newGroup){
        return repository.save(newGroup);
    }

    public void deleteById(Long Id){
        repository.deleteById(Id);
    }

}
