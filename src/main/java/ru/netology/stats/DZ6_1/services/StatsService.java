package ru.netology.stats.DZ6_1.services;

public class StatsService {

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

    public int sumSales(int[] sales) { // Сумму всех продаж

        int sum = 0;

        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averSumSales(int[] sales) { // Среднюю сумму продаж в месяц
        return sumSales(sales) / sales.length;
    }

    public int maxMonthNumber(int[] sales) { //// Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*

        int maxPosition = 0;

        for (int i =1;i < sales.length; i++) {
            if(sales[maxPosition] <= sales[i]){
                maxPosition = i;
            }
        }
        return maxPosition;
    }

    public int minMonthNumber(int[] sales) { // Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*

        int minPosition = 0;

        for (int i =1;i < sales.length; i++) {
            if(sales[minPosition] >= sales[i]){
                minPosition = i;
            }
        }
        return minPosition;
    }

    public int sumMonthMin(int[] sales) { // Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)

        int middle = averSumSales(sales);
        int minMonths = 0;

        for (int sale : sales) {
            if (sale < middle) {
                minMonths++;
            }
        }
        return minMonths;
    }

    public int sumMonthMax(int[] sales) { // Кол-во месяцев, в которых продажи были выше среднего (см. п.2)

        int middle = averSumSales(sales);
        int maxMonths = 0;

        for (int sale : sales) {
            if (sale > middle) {
                maxMonths++;
            }
        }
        return maxMonths;
    }
}

