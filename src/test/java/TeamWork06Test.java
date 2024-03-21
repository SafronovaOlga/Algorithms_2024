import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.awt.SystemColor.text;


public class TeamWork06Test {

        final static String TEXT = "Иногда хватает мгновения, чтобы забыть жизнь, а иногда не хватает жизни, чтобы забыть мгновение.";

        @Test
        public void testHappyPathVerifyWordsAmount() {

            int expectedWordsAmount = 14;
           // int expectedWordsAmount = TeamWork06.countWords(TEXT);

            WebDriver driver = new ChromeDriver();
            driver.get("https://citaty.info/topic/zhizn/short");

            WebElement actualWordsAmount =
                    driver.findElement(By.xpath("//p[contains(text(),'Иногда хватает мгновения, ')]"));
          //  actualWordsAmount.getText();


            Assert.assertEquals(actualWordsAmount, expectedWordsAmount);

            driver.quit();
        }

 // //p[contains(text(),'Иногда хватает мгновения, ')]

    @Test
    public void testGetText() {
        int expectedResult = 14;

        WebDriver driver = new ChromeDriver();
        driver.get("https://citaty.info/topic/zhizn/short");

        // Считывание цитаты
        String quote = driver.findElement(By.cssSelector(".view-content")).getText();
        int actualResult = TeamWork06.countWords(quote);

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();

//        int wordCount = TeamWork06.countWords(quote);
//
//        // Проверка на соответствие ожидаемому результату
//        if (wordCount == 14) {
//            System.out.println("Тест пройден: количество слов в цитате равно 14");
//        } else {
//            System.out.println("Тест не пройден: количество слов в цитате не равно 14");
//        }

//               driver.findElements(By.xpath("//div[@class='field-item even last']/p"));

       //int actualResult = elements.size();

        // Assert.assertEquals(actualResult, expectedResult);
    }
    /**
     * public class TeamWork06Test {
     *
     *     private static final String TEST_SENTENCE = "Иногда хватает мгновения, ";
     *     @Test
     *     public void testHappyPathVerifyWordsAmount() {
     *
     *         final int expectedResult = TeamWork06.countWords(TEST_SENTENCE);
     *
     *        // int expectedWordsAmount = 14;
     *         // int expectedWordsAmount = TeamWork06.countWords(TEXT);
     *
     *         WebDriver driver = new ChromeDriver();
     *         driver.get("https://citaty.info/topic/zhizn/short");
     *
     *
     *         //int actualWordsAmount = TeamWork06.countWords(
     *         WebElement textarea = driver.findElement(By.xpath("//p[contains(text(),'Иногда хватает мгновения, ')]"));
     *
     *         textarea.sendKeys(TEST_SENTENCE);
     *
     *         Assert.assertEquals(textarea, expectedResult);
     *
     *         driver.quit();
     *     }
     *
     * }
     */


}
