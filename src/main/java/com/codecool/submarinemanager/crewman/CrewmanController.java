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
    public Iterable<Crewman> showAllCrewmen() {
        return this.crewmanService.findAllCrewmen();
    }

    @PostMapping(path = "")
    public void createCrewman(@RequestBody Crewman crewman) {
        this.crewmanService.saveCrewman(crewman);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteCrewman(@PathVariable Integer id) throws IdDoesNotExistException {
        this.crewmanService.deleteCrewman(id);
    }

    @GetMapping(path = "/{id}")
    public Crewman showCrewman(@PathVariable Integer id) throws IdDoesNotExistException {
        return this.crewmanService.findCrewmanById(id);
    }

    @PutMapping(path = "/{id}")
    public void updateCrewman(@PathVariable Integer id, @RequestBody Crewman updatedCrewman) throws IdDoesNotExistException {
        this.crewmanService.updateCrewman(id, updatedCrewman);
    }
}