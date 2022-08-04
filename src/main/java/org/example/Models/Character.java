package org.example.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "CHARACTER_TABLE")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Basic
    private String name;
    private String catchphrase;

    @ManyToOne
    private Actor actor;

    @ManyToOne
    private Show show;
}
