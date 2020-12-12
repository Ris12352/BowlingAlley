package com.company.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Round {

    int roundNumber;

    Map<String, List<Integer>> userPoints;

    public Round(int roundNumber, Map<String) {
        this.roundNumber = roundNumber;
        this.userPoints = new HashMap<String, List<Integer>>();
    }

}
