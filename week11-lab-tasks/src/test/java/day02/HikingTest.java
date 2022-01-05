package day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    Hiking hiking;

    @BeforeEach
    void init() {
        hiking = new Hiking();
    }

    @Test
    void testGetElevation() {
        List<Double> elevations = new ArrayList(Arrays.asList(10.0, 20.0, 15.0, 18.0));
        assertEquals(13.0, hiking.getPlusElevation(elevations));
    }

    @Test
    void testFullElevationIncreasing() {
        List<Double> elevations = new ArrayList(Arrays.asList(10.0, 20.0, 25.0, 30.0, 31.0));
        assertEquals(21.0, hiking.getPlusElevation(elevations));
    }

    @Test
    void testFullElevationDecreasing() {
        List<Double> elevations = new ArrayList(Arrays.asList(31.0, 30.0, 20.0, 10.0, 3.0));
        assertEquals(0.0, hiking.getPlusElevation(elevations));
    }

}