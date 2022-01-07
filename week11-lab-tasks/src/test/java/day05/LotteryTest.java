package day05;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    void testNewLotteryList() {
        Lottery lottery = new Lottery(90, 5);
        Set<Integer> result = lottery.startLottery();
        assertEquals(5, result.size());
        System.out.println(result);

        for (int i = 0; i < result.size(); i++) {
            //assertFalse(result.subList(i+1, result.size()).contains(result.get(i)));
        }

    }

}