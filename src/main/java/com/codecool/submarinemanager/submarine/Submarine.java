package com.codecool.submarinemanager.submarine;

import com.codecool.submarinemanager.crewman.Crewman;

import java.util.List;

public class Submarine {

    private Integer id;
    private String category;
    private String name;
    private List<Crewman> crewmenList;

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
