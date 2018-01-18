package com.codecool.submarinemanager.submarine;

import com.codecool.submarinemanager.crewman.Crewman;
import com.codecool.submarinemanager.exception.IdDoesNotExistException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/submarines")
public class SubmarineController {

    private SubmarineService submarineService;

    public SubmarineController(SubmarineService submarineService) {
        this.submarineService = submarineService;
    }

    @GetMapping(path = "")
    public Iterable<Submarine> showAllSubmarines() {
        return this.submarineService.findAllSubmarines();
    }

    @PostMapping(path = "")
    public void createSubmarine(@RequestBody Submarine submarine) {
        this.submarineService.saveSubmarine(submarine);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteSubmarine(@PathVariable Integer id) throws IdDoesNotExistException{
        this.submarineService.deleteSubmarine(id);
    }

    @GetMapping(path = "/{id}")
    public Submarine showSubmarine(@PathVariable Integer id) throws IdDoesNotExistException{
        return this.submarineService.findSubmarineById(id);
    }

    @PutMapping(path = "/{id}")
    public void updateSubmarine(@PathVariable Integer id, @RequestBody Submarine submarine) throws IdDoesNotExistException {
        this.submarineService.updateSubmarine(id, submarine);
    }

    @GetMapping(path = "/{id}/crewmen")
    public Iterable<Crewman> showSubmarinesCrewmen(@PathVariable Integer id) throws IdDoesNotExistException {
        return this.submarineService.showSubmarinesCrewmen(id);
    }
}