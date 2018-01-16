package com.codecool.submarinemanager.crewman;

import com.codecool.submarinemanager.submarine.Submarine;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Crewman {

    @Id
    @GeneratedValue
    private Integer id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String rank;
    @ManyToOne
    private Submarine submarine;

    public Crewman(Integer id, String firstName, String lastName, String rank, Submarine submarine) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rank = rank;
        this.submarine = submarine;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Submarine getSubmarine() {
        return submarine;
    }

    public void setSubmarine(Submarine submarine) {
        this.submarine = submarine;
    }
}
