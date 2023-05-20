package ru.netology.service;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void remainIs1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test

    public void remainIs500() {
        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(500);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test

    public void remainIs0() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test

    public void remainIs999() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test

    public void remainIs1001() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);

        org.junit.Assert.assertEquals(actual, expected);
    }
}