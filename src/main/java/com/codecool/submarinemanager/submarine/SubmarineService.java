package com.codecool.submarinemanager.submarine;

public class SubmarineService {

    private SubmarineRepository submarineRepository;

    public SubmarineService(SubmarineRepository submarineRepository) {
        this.submarineRepository = submarineRepository;
    }
}
