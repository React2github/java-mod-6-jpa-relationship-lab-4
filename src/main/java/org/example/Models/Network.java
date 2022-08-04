package org.example.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "NETWORK_TABLE")
public class Network {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Basic
    private String call_letters;
    private int channel;

    @OneToMany(mappedBy = "network")
    private List<Show> showList = new ArrayList<>();
}
