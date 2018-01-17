package com.codecool.submarinemanager.crewman;

import com.codecool.submarinemanager.crewman.Crewman;
import com.codecool.submarinemanager.crewman.CrewmanRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CrewmanServiceImpl implements CrewmanService {

    private CrewmanRepository crewmanRepository;

    CrewmanServiceImpl(CrewmanRepository crewmanRepository) {
        this.crewmanRepository = crewmanRepository;
    }

    public Iterable<Crewman> findAllCrewmen() {
        return crewmanRepository.findAll();
    }

    public Crewman findCrewmanById(Integer id) {
        return crewmanRepository.findOne(id);
    }

    public void saveCrewman(Crewman crewman) {
        crewmanRepository.save(crewman);
    }

    public void deleteCrewman(Integer id) {
        crewmanRepository.delete(id);
    }
}
