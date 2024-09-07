package SnakeAndLadder.Entities;

public class Ladder extends  BoardEntity {
    public Ladder(int start, int end) {
        super(start, end);
    }

    @Override
    public String encounteredMessage() {
        return "Encountered a ladder";
    }
}
