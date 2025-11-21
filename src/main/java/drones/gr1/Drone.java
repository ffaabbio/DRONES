package drones.gr1;

public class Drone {
    String nom;
    Vitesse vitesse;
    Position position;
    MoveResult reject =  new Rejected();
    MoveResult moving = new Moving();

    public MoveResult goTo(Position position){
        return moving;
    }
}
