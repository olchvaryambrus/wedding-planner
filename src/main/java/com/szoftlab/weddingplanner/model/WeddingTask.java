package com.szoftlab.weddingplanner.model;

import javax.persistence.*;

@Entity
public class WeddingTask {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private GroupOfTasks group;



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

    public GroupOfTasks getGroup() {
        return group;
    }

    public void setGroup(GroupOfTasks group) {
        this.group = group;
    }
}
