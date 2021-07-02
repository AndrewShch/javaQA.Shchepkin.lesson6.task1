package ru.netology.stats;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    void calculateSum () {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 200;
        long actual = service.calculateSum(sales);
        assertEquals(expected, actual);

    }
    @Test
    void averageSales () {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 30;
        long actual = service.averageSales(sales);
        assertEquals(expected, actual);
    }
    @Test
    void maxSales () {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }
    @Test
    void minSales () {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 10;
        long actual = service.minSales(sales);
        assertEquals(expected, actual);
    }
    @Test
    void belowAverageMonth () {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;
        long actual = service.belowAverageMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void aboveAverageMonth () {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.aboveAverageMonth(sales);
        assertEquals(expected, actual);
    }
}
