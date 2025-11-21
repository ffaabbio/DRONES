package drones.gr1;

import drones.gr1.AddResponse.AddResponse;
import drones.gr1.AddResponse.Added;


public class Fleet {
    private AllDrones allDrones;
    private AllMissions allMissions;

    public AddResponse AddDrone(Drone drone)
    {
        this.allDrones.add(drone);
        return new Added();
    }

    public Boolean RemoveDrone()
    {
        return false;
    }

    //On peut ajouter une nouvelle mission à condition qu'un drone soit disponible (i.e. qu'il ne soit pas sur une autre mission et qu'il puisse atteindre toutes les positions en vérifiant les altitudes)
    public Boolean AddMission()
    {
        return false;
    }

    public void reportMission()
    {

    }

    public void reportDrones()
    {


    }

    //qui permet de créer une mission à partir d'un parcours.
    public void plan()
    {


        //Retourner soit un objet OK si la mission a été créée. objet KO si la mission ne peut être
    }



}
