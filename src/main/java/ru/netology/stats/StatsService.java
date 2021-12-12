package ru.netology.stats;

public class StatsService {

    public long calcSum(long[] sales) {
        long sum = 0;

        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calcAvg(long[] sales) {
        return calcSum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве

        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int belowAvg(long[] sales) {
        int counter = 0;
        long avg = calcAvg(sales);

        for (long sale : sales) {
            if (sale < avg) {
                counter++;
            }
        }
        return counter;
    }

    public int overAvg(long[] sales) {
        int counter = 0;
        long avg = calcAvg(sales);

        for (long sale : sales) {
            if (sale > avg) {
                counter++;
            }
        }
        return counter;
    }

}
