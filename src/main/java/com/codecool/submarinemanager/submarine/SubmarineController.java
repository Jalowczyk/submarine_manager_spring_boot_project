package com.codecool.submarinemanager.submarine;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/submarines")
public class SubmarineController {

    private SubmarineService submarineService;

    public SubmarineController(SubmarineService submarineService) {
        this.submarineService = submarineService;
    }
}
