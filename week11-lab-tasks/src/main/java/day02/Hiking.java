package day02;

import java.util.List;

public class Hiking {

    public Double getPlusElevation(List<Double> elevations) {
        double sumLifting = 0;
        for (int i = 0; i < elevations.size()-1; i++) {
            if (elevations.get(i) < elevations.get(i+1)) {
                sumLifting += elevations.get(i+1) - elevations.get(i);
            }
        }
        return  sumLifting;
    }
}
