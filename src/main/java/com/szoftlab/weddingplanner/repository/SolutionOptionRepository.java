package com.szoftlab.weddingplanner.repository;

import com.szoftlab.weddingplanner.model.SolutionOption;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SolutionOptionRepository extends CrudRepository<SolutionOption, Long> {

    List<SolutionOption> findByTaskId(Long taskId);
}
