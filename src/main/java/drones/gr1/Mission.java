package drones.gr1;

public class Mission {
    private String name;
    private Path path;


    Mission(String name, Path path) {
        this.name = name;
        this.path = path;
    }

    public Boolean next(Drone drone){
        if(this.path.nexPosition(drone.position)){}
    }
}
