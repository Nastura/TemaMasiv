package ru.netology.stats;

public class StatsService {

    // МЕТОД 1. Сумма всех продаж;

    public int salesAmount(long[] sales) {
        long initialSalesAmount = 0; //  изначальная сумма = 0

        for (long value : sales) {
            initialSalesAmount += value;
        }
        return (int) initialSalesAmount;
    }

    // МЕТОД 2. Cредняя сумма продаж в месяц;
    // среднее = сумма чисел/количество чисел.
    public int averageSalesAmount(long[] sales) {
        int initialSalesAmount = 0;
        for (long d : sales) {
            initialSalesAmount += d;
        }

        return initialSalesAmount / sales.length;

    }

    // МЕТОД 3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;;

    public int monthsWithMaximumSales(long[] sales) {
        int monthsMaximumSales = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthsMaximumSales]) { // значит, в рассматриваемом i-м месяце продаж больше
                monthsMaximumSales = i; // запомним его как максимальный
            }
        }

        return monthsMaximumSales + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    // МЕТОД 4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*;

    public int monthsWithMinimalSales(long[] sales) {
        int monthsMinimumSales = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthsMinimumSales]) { // значит, в рассматриваемом i-м месяце продаж меньше
                monthsMinimumSales = i; // запомним его как минимальный
            }
        }

        return monthsMinimumSales + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    // МЕТОД 5. Количество месяцев, в которых продажи были ниже среднего (см. п.2);

    public int salesBelowAverage(long[] sales) {
        int averageSales = averageSalesAmount(sales);
        int initialSalesAmount = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales)
                initialSalesAmount++;
        }

        return initialSalesAmount;

    }

    // МЕТОД 6. Количество месяцев, в которых продажи были выше среднего (см. п.2);

    public int salesAboveAverage(long[] sales) {
        int averageSales = averageSalesAmount(sales);
        int initialSalesAmount = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                initialSalesAmount++;
            }
        }
        return initialSalesAmount;
    }
}

