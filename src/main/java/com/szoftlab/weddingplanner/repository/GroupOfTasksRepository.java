package com.szoftlab.weddingplanner.repository;

import com.szoftlab.weddingplanner.model.GroupOfTasks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupOfTasksRepository extends CrudRepository<GroupOfTasks, Long> {

    List<GroupOfTasks> findAll();

}
