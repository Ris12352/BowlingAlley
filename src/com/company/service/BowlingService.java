package com.company.service;

import com.company.models.Round;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class BowlingService {

    static Map<Integer, Round> rounds;

    static Map<String, Map<Integer, Round>> userScores;

    public BowlingService() {
        rounds = new HashMap<Integer, Round>();
        userScores = new HashMap<String, Map<Integer, Round>>();
    }

    public void chooseWinner() {

    }

    public int rollPin(int number) {

    }

    public void startGame(int numberOfPlayers, int numberOfRounds) {
        Queue<Integer> chances
    }
}
