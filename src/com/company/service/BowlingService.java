package com.company.service;

import com.company.enums.Bonus;
import com.company.models.Round;

import java.util.*;

public class BowlingService {

    static Map<Integer, Round> rounds;

    static Map<Integer, Map<Integer, Integer>> userScores;

    Queue<Integer> players;

    public BowlingService() {
        rounds = new HashMap<Integer, Round>();
        userScores = new HashMap<Integer, Map<Integer, Integer>>();
    }

    public void chooseWinner() {

    }

    public int rollPin(int number) {
        if(number < 0 || number > 10) {
            System.out.println("Invalid input, pin number is not in range");
            return 0;
        }

        return number;
    }

    public void startGame(int numberOfPlayers) {
        players = new LinkedList<>();
        int count = 0;
        while(count < numberOfPlayers) {
            players.offer(count++);
        }
    }

    public void playRound(int roundNumber, int playerNumber, int firstAttempt, int secondAttempt) {
        int score1 = rollPin(firstAttempt);
        if(score1 == 10) {
            score1 += Bonus.STRIKE.getBonus();
        }
        int score2 = 0;
        if(score1 < 10) {
            if(secondAttempt <= 10-score1) {
                score2 = rollPin(secondAttempt);
                if(score1 + score2 == 10) {
                    score2 += Bonus.SPARE.getBonus();
                }
            }else {
                System.out.println("Invalid Input score2");
            }
        }

        int totalScore = score1 + score2;

        Round round = rounds.get(roundNumber);
        if(round == null) {
            round = new Round(roundNumber);
        }


        for(Map.Entry<Integer, List<Integer>> entry : round.getUserPoints().entrySet()) {
            if(entry.getKey() == playerNumber) {
                List<Integer> scores = entry.getValue();
                if(scores == null) {
                    scores = new ArrayList<>();
                }
                scores.add(score1);
                scores.add(score2);
            }
        }
    }
}
