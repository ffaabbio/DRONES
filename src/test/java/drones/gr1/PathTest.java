package drones.gr1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PathTest {

    @Test
    public void pathShouldThrowExceptionWhenEmpty() {
        List<Position> path = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> {new Path(path);});
    }
}
