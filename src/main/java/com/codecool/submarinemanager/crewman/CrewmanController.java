package com.codecool.submarinemanager.crewman;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/crewmen")
public class CrewmanController {

    private CrewmanService crewmanService;

    public CrewmanController(CrewmanService crewmanService) {
        this.crewmanService = crewmanService;
    }

    @PostMapping(path = "")
    public Iterable<Crewman> showAll() {
        return this.crewmanService.findAllCrewmen();
    }

}
