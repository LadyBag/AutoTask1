package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void Test1() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);

        assertEquals(100, actual);

    }

    @Test
    public void Test2() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);

        assertEquals(0, actual);


    }
}