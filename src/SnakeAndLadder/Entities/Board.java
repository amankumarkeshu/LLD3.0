package SnakeAndLadder.Entities;

import SnakeAndLadder.Factory.BoardEntityEnum;
import SnakeAndLadder.Factory.BoardEntityFactory;
import SnakeAndLadder.Service.RandomNumberGenerator;

import java.util.HashMap;

public class Board {

    int size;

    HashMap<Integer, BoardEntity> cells;

    public Board(int size) {
        this.size = size;
        this.cells = new HashMap<>();

        int dimension =(int) Math.sqrt(size);

        for( int index = 0; index < dimension; index ++) {

            // We need to create a snake at a position where there is no snake or ladder
            int start = 2, end = size -1 ;
            int snakeStart = RandomNumberGenerator.generateRandomNumber(start, end);

            int snakeEnd  = RandomNumberGenerator.generateRandomNumber(start, snakeStart - 1);
            if (!isSnakeOrLadder(snakeStart)) {
                this.cells.put(snakeStart, BoardEntityFactory.createEntity(BoardEntityEnum.SNAKE, snakeStart, snakeEnd));
            }

            // Create a ladder
            start = 2;
            end = size - 1;

            int ladderStart = RandomNumberGenerator.generateRandomNumber(start, end);
            int ladderEnd =  RandomNumberGenerator.generateRandomNumber(ladderStart + 1, end);

            if(!isSnakeOrLadder(ladderStart)) {
                this.cells.put(ladderStart, BoardEntityFactory.createEntity(BoardEntityEnum.LADDER, ladderStart , ladderEnd));
            }

        }
        printBoard();
    }

    public void printBoard() {
        int dimension = (int) Math.sqrt(size);
        for ( int index= 1 ;index <= size; index++ ){


            if (isSnakeOrLadder(index)){
                System.out.print(this.cells.get(index).encounteredMessage()  + " ");
            }
            System.out.print(index + " ");
            if (index % dimension == 0){
                System.out.println();
            }
        }
    }
    public boolean isSnakeOrLadder( int index ){
        if (this.cells.containsKey(index)) {
            return true;
        }
        return false;
    }


}
