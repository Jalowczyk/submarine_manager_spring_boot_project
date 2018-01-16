package com.codecool.submarinemanager.submarine;

import com.codecool.submarinemanager.crewman.Crewman;
import com.codecool.submarinemanager.crewman.CrewmanRepository;

public class CrewmanService {

    private CrewmanRepository crewmanRepository;

    public CrewmanService(CrewmanRepository crewmanRepository) {
        this.crewmanRepository = crewmanRepository;
    }

    public Iterable<Crewman> findAllCrewmen() {
        return crewmanRepository.findAll();
    }

    public Crewman findById(Integer id) {
        return crewmanRepository.findOne(id);
    }
}
