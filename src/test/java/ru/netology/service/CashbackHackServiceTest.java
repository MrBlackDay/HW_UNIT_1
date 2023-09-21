package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    void limitValuesWhen1000ShouldBe0() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void limitValuesWhen999ShouldBe1() {

        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    void limitValuesWhen1001ShouldBe999() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    void equivalenceClassLess1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 888;
        int actual = service.remain(amount);
        int expected = 112;

        assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    void equivalenceClassMore1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 4200;
        int actual = service.remain(amount);
        int expected = 800;

        assertEquals(expected, actual);
    }
}