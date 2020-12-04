package com.szoftlab.weddingplanner.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
public class WeddingTask {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Boolean isDone;

    @ManyToOne
    @ToString.Exclude
    @JsonIgnore
    private GroupOfTasks group;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "task",fetch=FetchType.LAZY)
    private List<TaskNote> noteList;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "task",fetch=FetchType.LAZY)
    private List<SolutionOption> solutionOptions;

}
