package com.szoftlab.weddingplanner.controller;

import com.szoftlab.weddingplanner.model.SolutionOption;
import com.szoftlab.weddingplanner.model.TaskNote;
import com.szoftlab.weddingplanner.service.SolutionOptionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/options")
@CrossOrigin(origins = "http://localhost:4200")
public class SolutionOptionController {

    private SolutionOptionService service;

    public SolutionOptionController(SolutionOptionService solutionOptionService) { this.service = solutionOptionService; }


    @GetMapping("/taskId/{id}")
    public List<SolutionOption> getByTaskId(@PathVariable Long id) { return service.findByTaskId(id); }

    @PostMapping("/create")
    public SolutionOption postSolutionOption(@RequestBody SolutionOption newOption) { return this.service.save(newOption); }

    @DeleteMapping("/{id}")
    public void deleteSolutionOptionById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
