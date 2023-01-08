package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);


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
