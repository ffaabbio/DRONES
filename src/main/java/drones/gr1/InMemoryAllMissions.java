package drones.gr1;

import java.util.HashSet;
import java.util.Set;

public class InMemoryAllMissions implements AllMissions {
    Set<Mission> missions = new HashSet<>();

    @Override
    public void add(Mission mission) {
        if (!missions.contains(mission)) {
            missions.add(mission);
        } else {
            throw new IllegalArgumentException("Mission already exists");
        }
    }

    @Override
    public void remove(Mission mission) {
        if (missions.contains(mission)) {
            missions.remove(mission);
        } else {
            throw new IllegalArgumentException("Mission does not exist");
        }
    }
}
