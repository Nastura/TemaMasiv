import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
// Сумма 180 Кол-во чисел 12

    @Test    //Test 1 Сумма всех продаж;

    public void test1() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 180;
        int actualDay = service.salesAmount(sales);
        Assertions.assertEquals(expectedDay, actualDay);

    }

    @Test    //Test 2    Cредняя сумма продаж в месяц;

    public void test2() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 15;
        int actualDay = service.averageSalesAmount(sales);
        Assertions.assertEquals(expectedDay, actualDay);

    }

    @Test    //Test 3 Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;;

    public void test3() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 8;
        int actualDay = service.monthsWithMaximumSales(sales);
        Assertions.assertEquals(expectedDay, actualDay);

    }

    @Test    //Test 4 Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*;

    public void test4() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 9;
        int actualDay = service.monthsWithMinimalSales(sales);
        Assertions.assertEquals(expectedDay, actualDay);

    }

    @Test    //Test 5 Количество месяцев, в которых продажи были ниже среднего (см. п.2);

    public void test5() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 5;
        int actualDay = service.salesBelowAverage(sales);
        Assertions.assertEquals(expectedDay, actualDay);

    }

    @Test    //Test 6 Количество месяцев, в которых продажи были выше среднего (см. п.2);

    public void test6() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 5;
        int actualDay = service.salesAboveAverage(sales);
        Assertions.assertEquals(expectedDay, actualDay);

    }
}

