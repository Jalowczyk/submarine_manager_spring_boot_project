package com.codecool.submarinemanager.submarine;

import com.codecool.submarinemanager.crewman.Crewman;
import com.codecool.submarinemanager.crewman.CrewmanService;
import com.codecool.submarinemanager.exception.IdDoesNotExistException;
import org.springframework.stereotype.Service;

@Service
public class SubmarineServiceImpl implements SubmarineService {

    private SubmarineRepository submarineRepository;
    private CrewmanService crewmanService;

    public SubmarineServiceImpl(SubmarineRepository submarineRepository, CrewmanService crewmanService) {
        this.submarineRepository = submarineRepository;
        this.crewmanService = crewmanService;
    }

    public Iterable<Submarine> findAllSubmarines() {
        return submarineRepository.findAllByArchivedFalse();
    }

    public Submarine findSubmarineById(Integer id) throws IdDoesNotExistException {
        return returnSubmarineIfExists(id);
    }

    public void saveSubmarine(Submarine submarine) {
        submarineRepository.save(submarine);
    }

    public void deleteSubmarine(Integer id) throws IdDoesNotExistException {
        Submarine submarine = returnSubmarineIfExists(id);
        submarineRepository.delete(submarine);
    }

    public void updateSubmarine(Integer id, Submarine submarine) throws IdDoesNotExistException {
        returnSubmarineIfExists(id);
        submarine.setId(id);
        submarineRepository.save(submarine);
    }

    public Iterable<Crewman> showSubmarinesCrewmen(Integer id) throws IdDoesNotExistException {
        Submarine submarine = returnSubmarineIfExists(id);
        return crewmanService.findCrewmenBySubmarine(submarine.getId());
    }

    private Submarine returnSubmarineIfExists(Integer id) throws IdDoesNotExistException {
        Submarine submarine = submarineRepository.findSubmarineByArchivedFalseAndId(id);

        if (submarine == null) {
            throw new IdDoesNotExistException("no record of such id in database");
        }

        return submarine;
    }
}
