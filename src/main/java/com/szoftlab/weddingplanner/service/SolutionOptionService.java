package com.szoftlab.weddingplanner.service;

import com.szoftlab.weddingplanner.model.SolutionOption;
import com.szoftlab.weddingplanner.repository.SolutionOptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolutionOptionService {

    private SolutionOptionRepository repository;

    @Autowired
    public SolutionOptionService(SolutionOptionRepository solutionOptionRepository) { this.repository = solutionOptionRepository; }

    public List<SolutionOption> findByTaskId(Long taskId) { return repository.findByTaskId(taskId); }

    public SolutionOption save(SolutionOption newOption) { return repository.save(newOption); }

    public void deleteById(Long Id){
        repository.deleteById(Id);
    }

}
