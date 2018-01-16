package com.codecool.submarinemanager.submarine;

import com.codecool.submarinemanager.crewman.Crewman;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Submarine {
    @Id
    @GeneratedValue
    private Integer id;
    @NotNull
    private String category;
    @NotNull
    private String name;
    @OneToMany
    @JoinColumn(name = "submarine_id")
    private List<Crewman> crewmenList;

    private Submarine() {};

    public Submarine(Integer id, String category, String name) {
        this.id = id;
        this.category = category;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Crewman> getCrewmenList() {
        return crewmenList;
    }

    public void setCrewmenList(List<Crewman> crewmenList) {
        this.crewmenList = crewmenList;
    }
}
