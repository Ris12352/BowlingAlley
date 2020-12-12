package com.company.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Round {

    private int roundNumber;

    Map<String, List<Integer>> userPoints;

    public Map<String, List<Integer>> getUserPoints() {
        return userPoints;
    }

    public void setUserPoints(Map<String, List<Integer>> userPoints) {
        this.userPoints = userPoints;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    private ScoreBoard scoreBoard;

    public Round(int roundNumber) {
        this.roundNumber = roundNumber;
        this.userPoints = new HashMap<String, List<Integer>>();
    }

}
