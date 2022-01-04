package day02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    void testGetElevation() {
        Hiking hiking = new Hiking();
        List<Double> elevations = new ArrayList(Arrays.asList(10.0, 20.0, 15.0, 18.0));
        assertEquals(13.0, hiking.getPlusElevation(elevations));
    }

}