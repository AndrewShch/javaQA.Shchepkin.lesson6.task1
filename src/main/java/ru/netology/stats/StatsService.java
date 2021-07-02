package ru.netology.stats;

public class StatsService {
    public int calculateSum (long[] sales) {
        int sum = 0;
        for (long sale:sales) {
            sum+=sale;
        }
        return sum;
    }
    public int averageSales(long[] sales) {
        int sum = calculateSum(sales);
        return sum / sales.length;
    }
    public long maxSales (long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]){
                maxMonth = month;
            }
            month = month + 1;

        }
        return maxMonth + 1;
    }
    public long minSales (long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]){
                minMonth = month;
            }
            month = month + 1;

        }
        return minMonth + 1;
    }
    public int belowAverageMonth (long[] sales) {
        long averageSum = averageSales(sales);
        int count = 0 ;
        for (long sale : sales) {
            if (sale > averageSum){
                count++;
            }
        }
        return count;
    }

    public int aboveAverageMonth (long[] sales) {
        long averageSum = averageSales(sales);
        int count = 0 ;
        for (long sale : sales) {
            if (sale < averageSum){
                count++;
            }
        }
        return count;
    }
}
