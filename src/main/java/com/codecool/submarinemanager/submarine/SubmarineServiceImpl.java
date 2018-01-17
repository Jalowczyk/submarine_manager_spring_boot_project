package com.codecool.submarinemanager.submarine;

import com.codecool.submarinemanager.exception.IdDoesNotExistException;
import org.springframework.stereotype.Service;

@Service
public class SubmarineServiceImpl implements SubmarineService {

    private SubmarineRepository submarineRepository;

    public SubmarineServiceImpl(SubmarineRepository submarineRepository) {
        this.submarineRepository = submarineRepository;
    }

    public Iterable<Submarine> findAllSubmarines() {
        return submarineRepository.findAll();
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

    private Submarine returnSubmarineIfExists(Integer id) throws IdDoesNotExistException {
        Submarine submarine = submarineRepository.findOne(id);

        if (submarine == null) {
            throw new IdDoesNotExistException();
        }

        return submarine;
    }
}
