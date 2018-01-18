package com.codecool.submarinemanager.submarine;

import com.codecool.submarinemanager.crewman.Crewman;
import com.codecool.submarinemanager.exception.IdDoesNotExistException;

public interface SubmarineService {

    Iterable<Submarine> findAllSubmarines();
    Submarine findSubmarineById(Integer id) throws IdDoesNotExistException;
    void saveSubmarine(Submarine submarine);
    void deleteSubmarine(Integer id) throws IdDoesNotExistException;
    void updateSubmarine(Integer id, Submarine submarine) throws IdDoesNotExistException;
    Iterable<Crewman> showSubmarinesCrewmen(Integer id) throws IdDoesNotExistException;
}
