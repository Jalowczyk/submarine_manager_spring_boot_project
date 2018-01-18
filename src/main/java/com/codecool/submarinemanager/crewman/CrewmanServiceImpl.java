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
        return crewmanRepository.findAllByArchivedFalse();
    }

    public Crewman findCrewmanById(Integer id) throws IdDoesNotExistException {
        return returnCrewmanIfExists(id);
    }

    public void saveCrewman(Crewman crewman) {
        crewmanRepository.save(crewman);
    }

    public void deleteCrewman(Integer id) throws IdDoesNotExistException {
        Crewman crewman = returnCrewmanIfExists(id);
        crewmanRepository.delete(crewman);
    }

    public void updateCrewman(Integer id) throws IdDoesNotExistException {
        Crewman crewman = returnCrewmanIfExists(id);
        crewmanRepository.save(crewman);
    }

    private Crewman returnCrewmanIfExists(Integer id) throws IdDoesNotExistException {

        Crewman crewman = crewmanRepository.findCrewmanByArchivedFalseAndId(id);

        if (crewman == null) {
            throw new IdDoesNotExistException("no record of such id in database");
        }

        return crewman;
    }
}
