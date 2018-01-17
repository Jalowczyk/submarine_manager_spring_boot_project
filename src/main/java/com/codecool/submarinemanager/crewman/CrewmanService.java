package com.codecool.submarinemanager.crewman;

public interface CrewmanService {

    Iterable<Crewman> findAllCrewmen();
    Crewman findCrewmanById(Integer id);
    void saveCrewman(Crewman crewman);
    void deleteCrewman(Integer id);
}
