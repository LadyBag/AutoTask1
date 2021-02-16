package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void SomeTest(){
        assertEquals(2,2);
    }

    @Test
    public void Test1() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);

        assertEquals(actual, 100 );

    }

    @Test
    public void Test2() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);

        assertEquals( actual, 0);


    }

}