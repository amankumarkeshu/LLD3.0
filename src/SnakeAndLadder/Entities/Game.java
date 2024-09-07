package SnakeAndLadder.Entities;

import SnakeAndLadder.Service.DiceService;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Game {

    int diceCount;
    int dimension;

    int size;

    Board board;

    Queue<Person> players;

    Queue<Person> winners;

    public Game(int diceCount, int dimension) {
        this.diceCount = diceCount;
        this.dimension = dimension;
        this.size = dimension * dimension;
        this.board = new Board(this.size);
        this.players = new LinkedList<>();
        this.winners = new LinkedList<>();
    }

    public void launchGame() {

        while (this.players.size() > 1 ) {

            Person currentPerson = this.players.poll();

            System.out.println(currentPerson.getUsername() + " is at the position " + currentPerson.getPosition());

            // roll the dice and move to the next location
            int diceValue = DiceService.rollDice(diceCount);

            int curPosition = currentPerson.getPosition() + diceValue;

            if (this.board.isSnakeOrLadder(curPosition)) {
                BoardEntity boardEntity = this.board.cells.get(curPosition);
                System.out.println(boardEntity.encounteredMessage());
                curPosition = boardEntity.getEnd();
                currentPerson.setPosition(curPosition);
                this.players.add(currentPerson);

            } else if (curPosition == size) {
                // THis person won the game
                this.winners.add(currentPerson);
                System.out.println(currentPerson.getUsername() + " won the game");

            } else if(curPosition > size) {
                this.players.add(currentPerson);
            } else {
                currentPerson.setPosition(curPosition);
                this.players.add(currentPerson);
            }

        }

    }

    public void addPlayer(Person person){
        this.players.add(person);
    }


}
