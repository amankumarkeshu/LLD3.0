package BookMyShow.movie;

import java.util.ArrayList;
import java.util.List;

public class Cinema {

    String name;

    List<CinemaHall> hallList;

    public Cinema(String name) {
        this.name = name;
        hallList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CinemaHall> getHallList() {
        return hallList;
    }

    public void setHallList(List<CinemaHall> hallList) {
        this.hallList = hallList;
    }
}
