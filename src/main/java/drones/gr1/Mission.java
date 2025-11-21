package drones.gr1;

public class Mission {
    private String name;
    private Path path;


    Mission(String name, Path path) {
        this.name = name;
        this.path = path;
    }

    public Boolean next(Drone drone){
        try{
            drone.goTo(this.path.nextPosition(drone.getPosition()));
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
