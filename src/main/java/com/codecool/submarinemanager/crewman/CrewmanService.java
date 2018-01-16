package com.codecool.submarinemanager.crewman;

import com.codecool.submarinemanager.crewman.Crewman;
import com.codecool.submarinemanager.crewman.CrewmanRepository;

public class CrewmanService {

    private CrewmanRepository crewmanRepository;

    CrewmanService(CrewmanRepository crewmanRepository) {
        this.crewmanRepository = crewmanRepository;
    }

    Iterable<Crewman> findAllCrewmen() {
        return crewmanRepository.findAll();
    }

    Crewman findById(Integer id) {
        return crewmanRepository.findOne(id);
    }
}
