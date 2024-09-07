package SnakeAndLadder.Factory;

import SnakeAndLadder.Entities.BoardEntity;
import SnakeAndLadder.Entities.Ladder;
import SnakeAndLadder.Entities.Snake;

public class BoardEntityFactory {

    public static BoardEntity createEntity( BoardEntityEnum entityEnum, int start, int end) {

        switch (entityEnum) {
            case SNAKE -> {
                return new Snake(start , end);
            }
            case LADDER -> {
                return new Ladder(start, end);
            }
        }
        System.out.println("Invalid entity type passed");
        return null;
    }
}
