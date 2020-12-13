package com.szoftlab.weddingplanner.model;

import javax.persistence.*;

@Entity
public class TaskNote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;


    @JoinColumn(name = "task_id")
    @ManyToOne
    private WeddingTask task;

    public TaskNote() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
