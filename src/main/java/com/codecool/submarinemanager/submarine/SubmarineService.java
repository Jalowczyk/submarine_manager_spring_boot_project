package com.codecool.submarinemanager.submarine;

public interface SubmarineService {

    Iterable<Submarine> findAllSubmarines();
    Submarine findSubmarineById(Integer id);
    void saveSubmarine(Submarine submarine);
    void deleteSubmarine(Integer id);

}
