package drones.ex3;

import drones.gr1.Drone;

import java.util.List;
import java.util.Set;

public interface AllDrones {

    void add(Drone drone);
    void remove(Drone drone);
    List<Drone> all();
    Drone findByName(String name);
}
