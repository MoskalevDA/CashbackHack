package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void remainIs1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test

    public void remainIs500() {
        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(500);

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test

    public void remainIs0() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test

    public void remainIs999() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test

    public void remainIs1001() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);

        org.testng.Assert.assertEquals(actual, expected);
    }
}