package com.szoftlab.weddingplanner.model;


import javax.persistence.*;

@Entity
public class SolutionOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String text;

    @ManyToOne
    private WeddingTask task;

    public SolutionOption() {}

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public WeddingTask getTask() {
        return task;
    }

    public void setTask(WeddingTask task) {
        this.task = task;
    }
}
