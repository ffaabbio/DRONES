package drones.gr1;

import java.util.List;

public class Path {
    private List<Position> positions;

    Path(List<Position> positions) {
        if(positions.isEmpty()){
            throw new IllegalArgumentException("Path is empty");
        }
        this.positions = positions;
    }

    Position nextPosition(Position pos){
        for(int i = 0;i< this.positions.size();i++){
            if(this.positions.get(i).equals(pos)){
                if(this.positions.get(i+1).equals(this.positions.getLast())){
                    throw new IllegalArgumentException("Next position is out of the path");
                }
                return this.positions.get(i+1);
            }
        }
        return null;
    }

}
