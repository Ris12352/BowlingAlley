package com.company.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Round {

    private int roundNumber;

    Map<Integer, List<Integer>> userPoints;

    private ScoreBoard scoreBoard;

    public Map<Integer, List<Integer>> getUserPoints() {
        return userPoints;
    }

    public void setUserPoints(Map<Integer, List<Integer>> userPoints) {
        this.userPoints = userPoints;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public Round(int roundNumber) {
        this.roundNumber = roundNumber;
        this.userPoints = new HashMap<Integer, List<Integer>>();
    }

}
