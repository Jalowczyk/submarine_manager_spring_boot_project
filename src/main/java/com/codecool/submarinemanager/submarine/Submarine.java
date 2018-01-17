package com.codecool.submarinemanager.submarine;

import com.codecool.submarinemanager.crewman.Crewman;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.List;

@Entity
public class Submarine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty
    private String category;
    @NotEmpty
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Crewman> crewmenList;

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
