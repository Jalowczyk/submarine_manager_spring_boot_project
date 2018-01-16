package com.codecool.submarinemanager.crewman;

import com.codecool.submarinemanager.crewman.Crewman;
import com.codecool.submarinemanager.crewman.CrewmanRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
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

    void save(Crewman crewman) {
        crewmanRepository.save(crewman);

    }

    void delete(Crewman crewman) {
        crewmanRepository.delete(crewman);
    }
}
