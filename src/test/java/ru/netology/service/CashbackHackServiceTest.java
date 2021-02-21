package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {


    @Test
    public void shouldBuy100() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);

        assertEquals(actual, 100 );

    }

    @Test
    public void shouldBuy0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);

        assertEquals( actual, 0);


    }

    @Test
    public void shouldBuy500() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1500);

        assertEquals( actual, 500 );


    }
}