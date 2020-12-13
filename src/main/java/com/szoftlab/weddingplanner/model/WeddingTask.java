package com.szoftlab.weddingplanner.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class WeddingTask {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Boolean isDone = false;

    private TaskTypeEnum type;

    @ManyToOne
    private GroupOfTasks group;

    private String date;

    private String street;

    private String houseNum;

    private String city;

    private Long postalCode;

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

    public TaskTypeEnum getType() {
        return type;
    }

    public void setType(TaskTypeEnum type) {
        this.type = type;
    }

    public GroupOfTasks getGroup() {
        return group;
    }

    public void setGroup(GroupOfTasks group) {
        this.group = group;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Long postalCode) {
        this.postalCode = postalCode;
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
