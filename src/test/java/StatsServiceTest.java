import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
// Сумма 180 Кол-во чисел 12

    @Test    //Test 1

    public void test1() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 180;
        int actualDay = service.sumSale(sales);
        Assertions.assertEquals(expectedDay, actualDay);

    }

    @Test    //Test 2    Cредняя сумма продаж в месяц;

    public void test2() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 15;
        int actualDay = service.AverageSumSales(sales);
        Assertions.assertEquals(expectedDay, actualDay);

    }

    @Test    //Test 3

    public void test3() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 8;
        int actualDay = service.maxSales(sales);
        Assertions.assertEquals(expectedDay, actualDay);

    }

    @Test    //Test 4

    public void test4() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 9;
        int actualDay = service.minSales(sales);
        Assertions.assertEquals(expectedDay, actualDay);

    }

    @Test    //Test 5

    public void test5() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 5;
        int actualDay = service.NumberOfMonthsMinSale(sales);
        Assertions.assertEquals(expectedDay, actualDay);

    }

    @Test    //Test 6
    public void test6() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 5;
        int actualDay = service.NumberOfMonthsMaxSale(sales);
        Assertions.assertEquals(expectedDay, actualDay);

    }
}

