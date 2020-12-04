package com.szoftlab.weddingplanner.controller;

import com.szoftlab.weddingplanner.model.WeddingTask;
import com.szoftlab.weddingplanner.service.WeddingTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
@CrossOrigin(origins = "http://localhost:4200")
public class WeddingTaskController {

    private WeddingTaskService service;

    @Autowired
    public WeddingTaskController(WeddingTaskService weddingTaskService) { this.service = weddingTaskService; }


    @GetMapping("/list")
    public List<WeddingTask> getAllWeddingTask(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<WeddingTask> getWeddingTaskById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping("/create")
    public WeddingTask postWeddingTask(@RequestBody WeddingTask newTask){
        return service.save(newTask);
    }

    @PutMapping("/{id}")
    WeddingTask replaceWeddingTask(@RequestBody WeddingTask newTask, @PathVariable Long id) {

        return service.findById(id)
                .map(changedTask -> {
                    changedTask.setName(newTask.getName());
                    changedTask.setIsDone(newTask.getIsDone());
                    changedTask.setGroup(newTask.getGroup());
                    changedTask.setNoteList(newTask.getNoteList());
                    changedTask.setSolutionOptions(newTask.getSolutionOptions());
                    return service.save(changedTask);
                })
                .orElseGet(() -> {
                    newTask.setId(id);
                    return service.save(newTask);
                });
    }

    @DeleteMapping("/{id}")
    public void deleteWeddingTaskById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
