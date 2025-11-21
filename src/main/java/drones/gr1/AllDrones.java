package drones.gr1;

import java.util.List;

public interface AllDrones {

    void add(Drone drone);
    void remove(Drone drone);
    List<Drone> all();
    Drone findByName(String name);
}
