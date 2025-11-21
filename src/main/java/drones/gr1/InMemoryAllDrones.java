package drones.gr1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InMemoryAllDrones implements AllDrones {
    Set<Drone> drones = new HashSet<>();

    @Override
    public void add(Drone drone) {
        if (!drones.contains(drone)) {
            drones.add(drone);
        } else {
            throw new IllegalArgumentException("Drone already exists");
        }
    }

    @Override
    public void remove(Drone drone) {
        if (drones.contains(drone)) {
            drones.remove(drone);
        } else {
            throw new IllegalArgumentException("Drone does not exist");
        }

    }

    @Override
    public List<Drone> all() {
        return new ArrayList<>(drones);
    }

    @Override
    public Drone findByName(String name) {
        for (Drone drone : drones) {
            if (drone.getNom().equals(name)) {
                return drone;
            }
        }
        return null;
    }
}
