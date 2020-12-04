package com.szoftlab.weddingplanner.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class WeddingTask {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Boolean isDone;

    @ManyToOne
    @ToString.Exclude
    private GroupOfTasks group;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "task",fetch=FetchType.LAZY)
    private List<TaskNote> noteList;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "task",fetch=FetchType.LAZY)
    private List<SolutionOption> solutionOptions;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsDone() {
        return isDone;
    }

    public void setIsDone(Boolean done) {
        isDone = done;
    }

    public GroupOfTasks getGroup() {
        return group;
    }

    public void setGroup(GroupOfTasks group) {
        this.group = group;
    }

    public List<TaskNote> getNoteList() {
        return noteList;
    }

    public void setNoteList(List<TaskNote> noteList) {
        this.noteList = noteList;
    }

    public List<SolutionOption> getSolutionOptions() {
        return solutionOptions;
    }

    public void setSolutionOptions(List<SolutionOption> solutionOptions) {
        this.solutionOptions = solutionOptions;
    }
}
