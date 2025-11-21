package drones.gr1;

public class Drone {
    String nom;
    Vitesse vitesse;
    Position position;
    Position altittudeMax = new Position(0,0,30);
    MoveResult reject =  new Rejected();
    MoveResult moving = new Moving();

    public Drone(Position position){
        this.position = position;
    }

    public MoveResult goTo(Position position){
        var result = position.altitudeNotMax(position);
        if(!result) return reject;
        return moving;
    }

    public Position getPosition(){
        return this.position;
    }
}
