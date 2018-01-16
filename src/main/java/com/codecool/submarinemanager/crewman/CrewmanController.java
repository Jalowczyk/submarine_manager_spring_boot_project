package com.codecool.submarinemanager.crewman;

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
    public String create(@RequestBody Crewman crewman) {
        return this.crewmanService.save(crewman);
    }

    @GetMapping(path = "/{id}")
    public Crewman show(@PathVariable Integer id) {
        return this.crewmanService.findById(id);
    }
}
