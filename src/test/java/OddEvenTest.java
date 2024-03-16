import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {
//           AAA == pattern
//        1. A is arrange (первая часть теста которая отвечает за извесные данные )  expectedResult
//        2. А act (вторая часть теста которая появляется при запуске нашего алгоритма ) actualResult
//        3. А assert (третья часть теста которая проверяет наш результат при сравнение)


    @Test
    public void testEvenNumberHappyPath() {

        int number = 2;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.printOddEven(number);
        // or  new OddEven().printOddEven(number);

        Assert.assertEquals(actualResult, expectedResult);







    }
}
