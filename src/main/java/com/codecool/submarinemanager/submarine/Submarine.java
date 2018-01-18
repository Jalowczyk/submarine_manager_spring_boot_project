package com.codecool.submarinemanager.submarine;

import com.codecool.submarinemanager.crewman.Crewman;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.ArrayList;
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
    @OneToMany(mappedBy = "submarine", cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JsonIgnoreProperties("submarine")
    @JsonIgnore
    private List<Crewman> crewmen = new ArrayList<>();
    @JsonIgnore
    private boolean archived = false;

    public boolean getArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        archived = archived;
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

    public List<Crewman> getCrewmen() {
        return crewmen;
    }

    public void setCrewmen(List<Crewman> crewmen) {
        this.crewmen = crewmen;
    }
}
