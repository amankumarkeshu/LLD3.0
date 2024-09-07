package SnakeAndLadder.Service;

public class RandomNumberGenerator {
    public static int generateRandomNumber( int mn , int mx) {
        return (int) Math.floor(Math.random() * ( mx - mn + 1)) + mn;
    }
}
