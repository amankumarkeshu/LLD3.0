package SnakeAndLadder.Entities;

public class Person {

    String username;
    int position;

    public Person(String username) {
        this.username = username;
        this.position = 0;
    }

    public String getUsername() {
        return username;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
