package com.codecool.submarinemanager.crewman;

import com.codecool.submarinemanager.submarine.Submarine;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface CrewmanRepository extends CrudRepository<Crewman, Integer> {

}
