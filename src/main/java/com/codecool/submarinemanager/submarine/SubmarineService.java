package com.codecool.submarinemanager.submarine;

import com.codecool.submarinemanager.exception.IdDoesNotExistException;

import javax.persistence.Id;

public interface SubmarineService {

    Iterable<Submarine> findAllSubmarines();
    Submarine findSubmarineById(Integer id) throws IdDoesNotExistException;
    void saveSubmarine(Submarine submarine);
    void deleteSubmarine(Integer id) throws IdDoesNotExistException;
    void updateSubmarine(Integer id) throws IdDoesNotExistException;

}
