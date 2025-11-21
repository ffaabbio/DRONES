package drones.gr1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DroneTest {
    @Test
    void AltitudeShouldBeSuperiorToMaxAltitude() {
        Vitesse vitesse = new Vitesse(22.0);
        Position position = new Position(0,0,0);
        Position destination = new Position(10,10,30);
        Drone drone = new Drone("Test",vitesse,position);

        var result = drone.goTo(destination);

        assertThat(drone.getReject()).isEqualTo(result);
    }
}
