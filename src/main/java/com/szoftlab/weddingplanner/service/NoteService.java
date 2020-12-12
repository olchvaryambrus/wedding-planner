package com.szoftlab.weddingplanner.service;

import com.szoftlab.weddingplanner.model.TaskNote;
import com.szoftlab.weddingplanner.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    private NoteRepository repository;

    @Autowired
    public NoteService(NoteRepository noteRepository) {
        this.repository = noteRepository;
    }

    public List<TaskNote> findAll(){
        return repository.findAll();
    }

    public List<TaskNote> findByTaskId(Long id) { return repository.findByTaskId(id); }

    public TaskNote save(TaskNote newNote) { return repository.save(newNote); }

    public void deleteById(Long Id){
        repository.deleteById(Id);
    }
}
