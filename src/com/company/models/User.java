package com.company.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {

    String name;

    Map<Integer, List<Integer>> scoresOnRound;

    public User(String name, String email) {
        this.name = name;
        scoresOnRound = new HashMap<>();
    }

    public String getName() {
        return name;
    }


    public Map<Integer, List<Integer>> getScoresOnRound() {
        return scoresOnRound;
    }

    public void setScoresOnRound(Map<Integer, List<Integer>> scoresOnRound) {
        this.scoresOnRound = scoresOnRound;
    }
}
