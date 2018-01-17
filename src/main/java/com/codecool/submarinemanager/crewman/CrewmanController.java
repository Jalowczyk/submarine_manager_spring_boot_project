package com.codecool.submarinemanager.crewman;

import com.codecool.submarinemanager.exception.IdDoesNotExistException;
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
        this.crewmanService.saveCrewman(crewman);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Integer id) throws IdDoesNotExistException {
        this.crewmanService.deleteCrewman(id);
    }

    @GetMapping(path = "/{id}")
    public Crewman show(@PathVariable Integer id) throws IdDoesNotExistException {
        return this.crewmanService.findCrewmanById(id);
    }
}