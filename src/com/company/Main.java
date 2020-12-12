package com.company;

import com.company.service.BowlingService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        while(true) {
            int numberOfPlayers = sc.nextInt();

            int numberOfRounds = 5;

            BowlingService bowlingService = new BowlingService();
            int currentRound = 1;
            while(currentRound <= numberOfRounds) {
                bowlingService.startGame(numberOfPlayers);
                int currentPlayer = 1;
                while(currentPlayer <= numberOfPlayers) {
                    bowlingService.playRound(currentRound, currentPlayer, sc.nextInt(), sc.nextInt());
                }
            }
        }
    }
}
