package SnakeAndLadder;

import SnakeAndLadder.Entities.Game;
import SnakeAndLadder.Entities.Person;

import java.util.Scanner;

public class DriverSnakeAndLadder {
    public static void main(String [] args) {

        int diceCount = 0, dimension ;

        System.out.println("Enter dice count");
        Scanner sc = new Scanner(System.in);
        diceCount = sc.nextInt();

        System.out.println("Enter dimension of the board");
        dimension = sc.nextInt();

        Game playGame = new Game(diceCount, dimension);

        Person akash = new Person("Akash");
        Person Shashwat = new Person ("Shashwat");
        Person ram = new Person("ram");
        Person Shyam = new Person ("Shyam");
        Person Aditi = new Person("Aditi");

        playGame.addPlayer(akash);
        playGame.addPlayer(Shashwat);
        playGame.addPlayer(ram);
        playGame.addPlayer(Shyam);
        playGame.addPlayer(Aditi);

        playGame.launchGame();

    }
}
