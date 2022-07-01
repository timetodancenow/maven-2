package ru.netology.stats;


import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class StatsServiceTest {

    @Test
    public void shouldSum () {
        StatsService service = new StatsService ();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum ( sales );
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assert.assertEquals ( expected, actual );
    }

    @Test
    public void findMax () {
        StatsService service = new StatsService ();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 20;
        long actual = service.findMax ( sales );

        Assert.assertEquals ( expected, actual );
    }

    @Test
    public void findMin () {
        StatsService service = new StatsService ();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 7;
        long actual = service.findMin ( sales );

        Assert.assertEquals ( expected, actual );
    }


}