package org.example.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "SHOW_TABLE")
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Basic
    private String name;
    private String day;
    private String season;
    private String genre;

    @OneToMany(mappedBy = "show")
    private List<Character> characterList = new ArrayList<>();

    @ManyToOne
    private Network network;
}
