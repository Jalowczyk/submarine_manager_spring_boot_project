package com.codecool.submarinemanager.crewman;

import com.codecool.submarinemanager.crewman.Crewman;
import com.codecool.submarinemanager.crewman.CrewmanRepository;
import com.codecool.submarinemanager.exception.IdDoesNotExistException;
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

    public Crewman findCrewmanById(Integer id) throws IdDoesNotExistException {

        Crewman crewman = crewmanRepository.findOne(id);

        if (crewman == null) {
            throw new IdDoesNotExistException();
        }

        return crewman;
    }

    public void saveCrewman(Crewman crewman) {
        crewmanRepository.save(crewman);
    }

    public void deleteCrewman(Integer id) throws IdDoesNotExistException {
        Crewman crewman = crewmanRepository.findOne(id);

        if (crewman == null) {
            throw new IdDoesNotExistException();
        }

        crewmanRepository.delete(id);
    }
}
