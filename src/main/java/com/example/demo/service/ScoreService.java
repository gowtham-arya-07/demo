package com.example.demo.service;

import com.example.demo.model.Score;

import org.springframework.stereotype.Service;

@Service
public class ScoreService {

    private final Score score = new Score();

    public Score getScore() {
        return score;
    }

    public void addRuns(int run) {
        score.addRuns(run);
    }

    public void addWicket() {
        score.addWicket();
    }
}