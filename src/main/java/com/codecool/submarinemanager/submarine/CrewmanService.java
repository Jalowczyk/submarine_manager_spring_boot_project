package com.codecool.submarinemanager.submarine;

import com.codecool.submarinemanager.crewman.Crewman;
import com.codecool.submarinemanager.crewman.CrewmanRepository;

import java.util.List;

public class CrewmanService {

    private CrewmanRepository crewmanRepository;

    public CrewmanService(CrewmanRepository crewmanRepository) {
        this.crewmanRepository = crewmanRepository;
    }

    public Iterable<Crewman> findAllCrewmen() {
        return crewmanRepository.findAll();
    }
}
