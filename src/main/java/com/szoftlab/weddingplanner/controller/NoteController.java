package com.szoftlab.weddingplanner.controller;

import com.szoftlab.weddingplanner.model.TaskNote;
import com.szoftlab.weddingplanner.service.NoteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
@CrossOrigin(origins = "http://localhost:4200")
public class NoteController {

    private NoteService service;

    public NoteController(NoteService noteService) { this.service = noteService; }

    @GetMapping("/list")
    public List<TaskNote> getAllTaskNote(){
        return service.findAll();
    }

    @GetMapping("/task/{id}")
    public List<TaskNote> getByTaskId(@PathVariable Long id) { return service.findByTaskId(id); }

    @PostMapping("/create")
    public TaskNote postTaskNote(@RequestBody TaskNote newNote) { return this.service.save(newNote); }
}
