package com.codecool.submarinemanager.submarine;

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

    public Submarine findSubmarineById(Integer id) {
        return submarineRepository.findOne(id);
    }

    public void saveSubmarine(Submarine submarine) {
        submarineRepository.save(submarine);
    }

    public void deleteSubmarine(Integer id) {
        submarineRepository.delete(id);
    }
}
