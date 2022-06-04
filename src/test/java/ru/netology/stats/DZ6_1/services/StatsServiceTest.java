package ru.netology.stats.DZ6_1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    StatsService service = new StatsService();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void ShouldCalculateSumAllSales() { // Сумму всех продаж

        int expextedSum = 180;
        int actualSum = service.sumSales(sales);

        Assertions.assertEquals(expextedSum, actualSum);
    }

    @Test
    void ShouldCalculateAverageMonthlySales() { // Среднюю сумму продаж в месяц

        int expectedAver = 15;
        int actualAver = service.averSumSales(sales);

        Assertions.assertEquals(expectedAver, actualAver);
    }

    @Test
    void ShouldCalculateNumberMonthMaxSales() { // Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*

        int expectedMaxMonth = 7;
        int actualMaxMonth = service.maxMonthNumber(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    void ShouldCalculateNumberMonthMixSales() { // Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*

        int expectedMinMonthNumber = 8;
        int actualMinMonthNumber = service.minMonthNumber(sales);

        Assertions.assertEquals(expectedMinMonthNumber, actualMinMonthNumber);
    }

    @Test
    void ShouldCalculateLessAverageMonthSales() { // Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)

        int expectedMonthMin = 5;
        int actualMonthMin = service.sumMonthMin(sales);

        Assertions.assertEquals(expectedMonthMin, actualMonthMin);
    }

    @Test
    void ShouldCalculateAboveAverageMonthSales() { // Кол-во месяцев, в которых продажи были выше среднего (см. п.2)

        int expectedMonthMax = 5;
        int actualMonthMax = service.sumMonthMax(sales);

        Assertions.assertEquals(expectedMonthMax, actualMonthMax);
    }
}
