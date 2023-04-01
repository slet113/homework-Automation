package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void countRemainIfAmount300() {
       CashbackHackService service = new CashbackHackService();

       int expected = 700;
       int actual = service.remain(300);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void countRemainIfAmount0() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void countRemainIfAmount1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void countRemainIfAmount2000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(2000);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void countRemainIfAmount1() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void countRemainIfAmount999() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);

        Assert.assertEquals(actual, expected);
    }
}