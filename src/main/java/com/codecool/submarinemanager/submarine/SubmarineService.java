package com.codecool.submarinemanager.submarine;

public class SubmarineService {

    private SubmarineRepository submarineRepository;

    public SubmarineService(SubmarineRepository submarineRepository) {
        this.submarineRepository = submarineRepository;
    }

    Iterable<Submarine> findAll() {
        return submarineRepository.findAll();
    }

    Submarine findById(Integer id) {
        return submarineRepository.findOne(id);
    }

    void save(Submarine submarine) {
        submarineRepository.save(submarine);
    }

    void delete(Submarine submarine) {
        submarineRepository.delete(submarine);
    }
}
