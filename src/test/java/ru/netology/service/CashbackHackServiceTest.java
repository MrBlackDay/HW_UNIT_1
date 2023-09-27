package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void limitValuesWhen1000ShouldBe0() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void limitValuesWhen999ShouldBe1() {

        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void limitValuesWhen1001ShouldBe999() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void equivalenceClassLess1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 888;
        int actual = service.remain(amount);
        int expected = 112;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void equivalenceClassMore1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 4200;
        int actual = service.remain(amount);
        int expected = 800;

        assertEquals(expected, actual);
    }
}