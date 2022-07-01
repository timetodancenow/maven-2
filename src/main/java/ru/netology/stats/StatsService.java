package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
           sum += sale;
        }
        return sum;
    }

    public long avg(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int aboveAvg(long[] sales) {
        long avg = avg(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }

    public int underAvg(long[] sales) {
        long avg = avg ( sales );
        int count = 0;
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    public int findMax(int[] sales) {
        int currentMax = 0;
        for(int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[currentMax]) {
                currentMax = i;
            }
        }
        return currentMax;
    }
    public int findMin(int[] sales) {
        int currentMin = 0;
        for(int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[currentMin]) {
                currentMin = i;
            }
        }
        return currentMin;
    }
}
