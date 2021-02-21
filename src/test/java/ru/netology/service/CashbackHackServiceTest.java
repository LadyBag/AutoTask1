package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldBuy100() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);

        assertEquals(100, actual);

    }

    @Test
    public void shouldBuy0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);

        assertEquals(0, actual);


    }
}