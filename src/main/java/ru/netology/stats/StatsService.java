package ru.netology.stats;

public class StatsService {

    // МЕТОД 1. Сумма всех продаж;

    public int sumSale(long[] sales) {
        long sumArray = 0; //  изначальная сумма = 0

        for (long value : sales) {
            sumArray += value;
        }
        return (int) sumArray;
    }

    // МЕТОД 2. Cредняя сумма продаж в месяц;
    // среднее = сумма чисел/количество чисел.
    public int AverageSumSales(long[] sales) {
        int AverageSum = 0;
        for ( long d : sales) {
            AverageSum += d;
        }

        return  AverageSum / sales.length;

    }

    // МЕТОД 3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;;

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    // МЕТОД 4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*;

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

//    // МЕТОД 5. Количество месяцев, в которых продажи были ниже среднего (см. п.2);
//
//    public int NumberOfMonthsMinSale(long[] sales) {
//        int minMonth = 0;
//
//        for (int i = 0; i < sales.length; i++) {
//            if (sales[i] <= sales[minMonth]) {
//                minMonth = i;
//            }
//        }
//
//        return minMonth + 1;
//    }
//
//    // МЕТОД 6. Количество месяцев, в выше среднего (см. п.2);
//
//    public int NumberOfMonthsMaxSale(long[] sales) {
//        int maxMonth = 0;
//
//        for (int i = 0; i < sales.length; i++) {
//            if (sales[i] <= sales[maxMonth]) {
//                maxMonth = i;
//            }
//        }
//
//        return maxMonth + 1;
//    }

}
