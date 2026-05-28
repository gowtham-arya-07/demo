package com.example.demo.controller;

import com.example.demo.model.Score;
import com.example.demo.service.ScoreService;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class ScoreController {

    private final ScoreService service;

    public ScoreController(ScoreService service) {
        this.service = service;
    }

    @GetMapping("/score")
    public Score getScore() {
        return service.getScore();
    }

    @PostMapping("/runs/{run}")
    public Score addRuns(@PathVariable int run) {

        service.addRuns(run);

        return service.getScore();
    }

    @PostMapping("/wicket")
    public Score addWicket() {

        service.addWicket();

        return service.getScore();
    }
}