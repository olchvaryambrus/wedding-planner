package com.szoftlab.weddingplanner.controller;

import com.szoftlab.weddingplanner.model.WeddingTask;
import com.szoftlab.weddingplanner.service.WeddingTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
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

    @GetMapping("/groupId/{id}")
    public List<WeddingTask> getByGroupId(@PathVariable Long id) { return service.findByGroupId(id); }

    @GetMapping("/countAll")
    public long getCountAllTask() { return service.countAll(); }

    @GetMapping("/countDone")
    public long getCountByIsDone() { return service.countByIsDoneTrue(); }

    @GetMapping("/countList")
    public List<Long> getCountList() { return service.getCountList(); }

    @PostMapping("/createAll")
    public Iterable<WeddingTask> postAllWeddingTask(@RequestBody Iterable<WeddingTask> newTasks) { return service.saveAll(newTasks); }

    @PostMapping("/create")
    public WeddingTask postWeddingTask(@RequestBody WeddingTask newTask){
        return service.save(newTask);
    }

    @PutMapping("/{id}")
    public WeddingTask replaceWeddingTask(@RequestBody WeddingTask newTask, @PathVariable Long id) {
        return service.findById(id)
                .map(changedTask -> {
                    changedTask.setName(newTask.getName());
                    changedTask.setIsDone(newTask.getIsDone());
                    changedTask.setType(newTask.getType());
                    changedTask.setGroup(newTask.getGroup());
                    changedTask.setDate(newTask.getDate());
                    changedTask.setStreet(newTask.getStreet());
                    changedTask.setHouseNum(newTask.getHouseNum());
                    changedTask.setCity(newTask.getCity());
                    changedTask.setPostalCode(newTask.getPostalCode());
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

    @DeleteMapping("/deleteList")
    public void deleteWeddingTaskList(@RequestBody List<WeddingTask> taskList) {
        service.deleteAll(taskList);
    }
}
