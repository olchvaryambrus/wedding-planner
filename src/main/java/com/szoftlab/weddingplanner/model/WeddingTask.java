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

}
