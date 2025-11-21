package drones.gr1;

import drones.gr1.MoveResult.MoveResult;
import drones.gr1.MoveResult.Moving;
import drones.gr1.MoveResult.Rejected;

public class Drone {
    String nom;
    Vitesse vitesse;
    Position position;
    Position altittudeMax = new Position(0,0,30);
    MoveResult reject =  new Rejected();
    MoveResult moving = new Moving();

    public Drone(String nom,Vitesse vitesse,Position position){
        this.nom = nom;
        this.vitesse = vitesse;
        this.position = position;
    }

    public MoveResult goTo(Position position){
        var result = position.altitudeNotMax(position);
        if(!result) return reject;
        return moving;
    }

    public String getNom() {
        return nom;
    }

    public Position getPosition(){
        return this.position;
    }

    public MoveResult getMoving() {
        return moving;
    }

    public MoveResult getReject() {
        return reject;
    }
}
