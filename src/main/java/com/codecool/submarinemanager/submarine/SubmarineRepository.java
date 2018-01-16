package com.codecool.submarinemanager.submarine;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SubmarineRepository extends CrudRepository<Submarine, Integer> {

    List<Submarine> findAllSubmarine();
    List<Submarine> findAllById(Integer id);
}
