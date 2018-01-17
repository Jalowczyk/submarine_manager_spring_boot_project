package com.codecool.submarinemanager.submarine;

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
    public void delete(@PathVariable Integer id) {
        this.submarineService.deleteSubmarine(id);
    }

    @GetMapping(path = "/{id}")
    public Submarine show(@PathVariable Integer id) {
        return this.submarineService.findSubmarineById(id);
    }
}