package com.codecool.submarinemanager.submarine;

import com.codecool.submarinemanager.exception.IdDoesNotExistException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/submarines")
public class SubmarineController {

    private SubmarineService submarineService;

    public SubmarineController(SubmarineService submarineService) {
        this.submarineService = submarineService;
    }

    @GetMapping(path = "")
    public Iterable<Submarine> showAll() {
        return this.submarineService.findAllSubmarines();
    }

    @PostMapping(path = "")
    public void create(@RequestBody Submarine submarine) {
        this.submarineService.saveSubmarine(submarine);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Integer id) throws IdDoesNotExistException{
        this.submarineService.deleteSubmarine(id);
    }

    @GetMapping(path = "/{id}")
    public Submarine show(@PathVariable Integer id) throws IdDoesNotExistException{
        return this.submarineService.findSubmarineById(id);
    }
}