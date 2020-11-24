package com.szoftlab.weddingplanner.repository;

import com.szoftlab.weddingplanner.model.WeddingTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeddingTaskRepository extends CrudRepository<WeddingTask, Long> {

    List<WeddingTask> findAll();

}
