package com.codecool.submarinemanager.crewman;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface CrewmanRepository extends CrudRepository<Crewman, Integer> {
    public Iterable<Crewman> findAllByArchivedFalse();
    public Crewman findCrewmanByArchivedFalseAndId(Integer id);
}
