package com.szoftlab.weddingplanner.repository;

import com.szoftlab.weddingplanner.model.TaskNote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends CrudRepository<TaskNote, Long> {

    List<TaskNote> findAll();

    List<TaskNote> findByTaskId(Long taskId);
}
