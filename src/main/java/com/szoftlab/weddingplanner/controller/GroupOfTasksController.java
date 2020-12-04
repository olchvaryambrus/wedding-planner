package com.szoftlab.weddingplanner.controller;

import com.szoftlab.weddingplanner.model.GroupOfTasks;
import com.szoftlab.weddingplanner.service.GroupOfTasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/groups")
@CrossOrigin(origins = "http://localhost:4200")
public class GroupOfTasksController {

    private GroupOfTasksService service;

    @Autowired
    public GroupOfTasksController(GroupOfTasksService groupOfTasksService) { this.service = groupOfTasksService; }


    @GetMapping("/list")
    public List<GroupOfTasks> getAllGroupOfTasks(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<GroupOfTasks> getGroupOfTasksById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping("/create")
    public GroupOfTasks postGroupOfTasks(@RequestBody GroupOfTasks newGroup){
        return service.save(newGroup);
    }

    @PutMapping("/{id}")
    public GroupOfTasks replaceGroupOfTasks(@RequestBody GroupOfTasks newGroup, @PathVariable Long id) {
        return service.findById(id)
                .map(changedGroup -> {
                    changedGroup.setName(newGroup.getName());
                    changedGroup.setIsDone(newGroup.getIsDone());
                    changedGroup.setTaskList(newGroup.getTaskList());
                    return service.save(changedGroup);
                })
                .orElseGet(() -> {
                    newGroup.setId(id);
                    return service.save(newGroup);
                });
    }

    @DeleteMapping("/{id}")
    public void deleteGroupOfTasksById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
