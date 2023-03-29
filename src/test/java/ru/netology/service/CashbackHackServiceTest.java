package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldSpendForMaxCashback() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldSpendForMaxCashbackIfAmountNull() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldSpendForMaxCashbackNull() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void upperBoundForMaxCashback() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);
        assertEquals(actual, expected);
    }

    @Test
    public void lowerBoundForMaxCashback() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(actual, expected);
    }
}