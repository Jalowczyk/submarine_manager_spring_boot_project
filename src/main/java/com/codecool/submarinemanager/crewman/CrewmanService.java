package com.codecool.submarinemanager.crewman;

import com.codecool.submarinemanager.exception.IdDoesNotExistException;

public interface CrewmanService {

    Iterable<Crewman> findAllCrewmen();
    Crewman findCrewmanById(Integer id) throws IdDoesNotExistException;
    void saveCrewman(Crewman crewman);
    void deleteCrewman(Integer id) throws IdDoesNotExistException;
    void updateCrewman(Integer id) throws IdDoesNotExistException;
}
