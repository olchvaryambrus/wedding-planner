package com.szoftlab.weddingplanner.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class GroupOfTasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Boolean isDone = false;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "group",fetch=FetchType.LAZY)
    private List<WeddingTask> taskList;


    public GroupOfTasks(Long id, String name, Boolean isDone, List<WeddingTask> taskList) {
        this.id = id;
        this.name = name;
        this.isDone = isDone;
        this.taskList = taskList;
    }

    public GroupOfTasks() {}

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

    public List<WeddingTask> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<WeddingTask> taskList) {
        this.taskList = taskList;
    }
}
