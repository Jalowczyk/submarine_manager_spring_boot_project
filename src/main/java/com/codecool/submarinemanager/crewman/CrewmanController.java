package com.codecool.submarinemanager.crewman;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/crewmen")
public class CrewmanController {

    private CrewmanService crewmanService;

    public CrewmanController(CrewmanService crewmanService) {
        this.crewmanService = crewmanService;
    }

    @GetMapping(path = "")
    public Iterable<Crewman> showAll() {
        return this.crewmanService.findAllCrewmen();
    }

    @PostMapping(path = "")
    public void create(@RequestBody Crewman crewman) {
        this.crewmanService.save(crewman);
    }

    @PostMapping(path = "/{id}")
    public void delete(@PathVariable Integer id) {
        this.crewmanService.delete(id);
    }

    @GetMapping(path = "/{id}")
    public Crewman show(@PathVariable Integer id) {
        return this.crewmanService.findById(id);
    }
}