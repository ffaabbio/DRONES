package drones.gr1;

import drones.gr1.Response.Response;
import drones.gr1.ValidationPlan.KO;
import drones.gr1.ValidationPlan.OK;
import drones.gr1.ValidationPlan.ValidationPlan;

public class Mission {
    private String name;
    private Path path;


    Mission(String name, Path path) {
        this.name = name;
        this.path = path;
    }

    public ValidationPlan next(Drone drone){
        try{
            drone.goTo(this.path.nextPosition(drone.getPosition()));
            return new OK();
        }catch(Exception e){
            System.out.println(e.getMessage());
            return new KO();
        }
    }
}
