package drones.gr1.MoveResult;

import drones.gr1.Position;

import java.util.Date;

public class Moving extends MoveResult {
    private Position destination;
    private Date arriveAt;

    public Position getDestination() {
        return destination;
    }

    public Date getArriveAt(){
        return arriveAt;
    }
}
