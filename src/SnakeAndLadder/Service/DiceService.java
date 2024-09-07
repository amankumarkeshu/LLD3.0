package SnakeAndLadder.Service;

public class DiceService {

    public static int rollDice(int diceCount) {

        int start = 1, end = 6;
        int totalDiceCount = 0;
        for( int iteration = 0 ; iteration < diceCount; iteration++) {
            int diceRolledValue =  RandomNumberGenerator.generateRandomNumber(start, end);
            totalDiceCount += diceRolledValue;

        }
        System.out.println("Dice rolled value is : " + totalDiceCount);
        return totalDiceCount;
    }
}
