package ru.netology;

import junit.framework.TestCase;
import org.junit.Test;

public class CashbackHackServiceTest extends TestCase {
    @Test
    public void testRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void testRemainAmountEqualdCash() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);


    }

    @Test
    public void testRemainZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;

        int expected = 1000;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);


    }

    @Test
    public void testRemainDownBorder() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1;

        int expected = 999;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);


    }

    @Test
    public void testRemainUpBorder() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;

        int expected = 1;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);


    }

    @Test
    public void testRemainMore() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;

        int expected = 999;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);


    }
}