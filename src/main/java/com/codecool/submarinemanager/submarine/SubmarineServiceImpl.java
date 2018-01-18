package com.codecool.submarinemanager.submarine;

import com.codecool.submarinemanager.crewman.Crewman;
import com.codecool.submarinemanager.exception.IdDoesNotExistException;
import org.springframework.stereotype.Service;

@Service
public class SubmarineServiceImpl implements SubmarineService {

    private SubmarineRepository submarineRepository;

    public SubmarineServiceImpl(SubmarineRepository submarineRepository) {
        this.submarineRepository = submarineRepository;
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
        submarineRepository.delete(id);
    }

    public void updateSubmarine(Integer id) throws IdDoesNotExistException {
        Submarine submarine = returnSubmarineIfExists(id);
        submarineRepository.save(submarine);
    }

    public Iterable<Crewman> showSubmarinesCrewmen(Integer id) throws IdDoesNotExistException {
        Submarine submarine = returnSubmarineIfExists(id);
        return submarine.getCrewmen();
    }

    private Submarine returnSubmarineIfExists(Integer id) throws IdDoesNotExistException {
        Submarine submarine = submarineRepository.findSubmarineByArchivedFalseAndId(id);

        if (submarine == null) {
            throw new IdDoesNotExistException("no record of such id in database");
        }

        return submarine;
    }
}
