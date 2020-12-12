package com.company.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {

    int playerNumber;

    Map<Integer, List<Integer>> scoresOnRound;

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    int totalScore;

    public Player(int number) {
        this.playerNumber = number;
        scoresOnRound = new HashMap<>();
    }

    public Integer getName() {
        return playerNumber;
    }


    public Map<Integer, List<Integer>> getScoresOnRound() {
        return scoresOnRound;
    }

    public void setScoresOnRound(Map<Integer, List<Integer>> scoresOnRound) {
        this.scoresOnRound = scoresOnRound;
    }
}
