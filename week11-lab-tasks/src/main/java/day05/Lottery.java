package day05;

import day04.Service;

import java.util.*;

public class Lottery {

    private int whatNumbersFrom; //hány számból
    private int numbersDb;

    public Lottery(int whatNumbersFrom, int numbersDb) {
        this.whatNumbersFrom = whatNumbersFrom;
        this.numbersDb = numbersDb;
    }

    public Set<Integer> startLottery() {
        Set<Integer> result = new TreeSet<>();
        do {
            Random rnd = new Random();
            int newNumber = rnd.nextInt(whatNumbersFrom-1) + 1;
            if (!result.contains(newNumber)) {
                result.add(newNumber);
            }
        }  while (result.size() != numbersDb);
        return result;
    }

}
