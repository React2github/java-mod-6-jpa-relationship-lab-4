package org.example.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "ACTOR_TABLE")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Basic
    private String first_name;
    private String last_name;

    @OneToMany(mappedBy = "actor")
    private List<Character> characterList = new ArrayList<>();

}
