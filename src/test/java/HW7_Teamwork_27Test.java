import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW7_Teamwork_27Test {

    @Test
    public void testHappyPathUniqueWordsAmount() {
        final  String TEXT = "это мой дом не твой дом";
        int expectedWordsAmount = 5;

        WebDriver driver = new ChromeDriver();
        driver.get("https://planetcalc.ru/3204/");
        driver.manage().window().maximize();

        WebElement textArea = driver.findElement(By.id("dialogv6411ef3aee88a_text"));
        textArea.clear();
        textArea.sendKeys(TEXT);
        driver.findElement(By.id("dialogv6411ef3aee88a_calculate")).click();

        int actualWordsAmount = HW7_Teamwork_27.getUniqueWordsAmount(TEXT);

        Assert.assertEquals(actualWordsAmount, expectedWordsAmount);
        driver.quit();
    }
    @Test
     public void testVerifyUniqueWordsAmount() {
        final String TEXT = "это мой дом не твой дом кот";
          int expectedWordsAmount = 6;

          WebDriver driver = new ChromeDriver();
          driver.get("https://planetcalc.ru/3204/");
          driver.manage().window().maximize();

          WebElement textArea = driver.findElement(By.id("dialogv6411ef3aee88a_text"));
          textArea.clear();
          textArea.sendKeys(TEXT);
          driver.findElement(By.id("dialogv6411ef3aee88a_calculate")).click();

          int actualWordsAmount = HW7_Teamwork_27.getUniqueWordsAmount(TEXT);

          Assert.assertEquals(actualWordsAmount, expectedWordsAmount);
          driver.quit();
      }

    @Test
    public void testVerifyUniqueWordsAmountNull() {
        int expectedWordsAmount = 0;

        WebDriver driver = new ChromeDriver();
        driver.get("https://planetcalc.ru/3204/");
        driver.manage().window().maximize();

        WebElement textArea = driver.findElement(By.id("dialogv6411ef3aee88a_text"));
        textArea.clear();

        driver.findElement(By.id("dialogv6411ef3aee88a_calculate")).click();

        int actualWordsAmount = HW7_Teamwork_27.getUniqueWordsAmount(null);

        Assert.assertEquals(actualWordsAmount, expectedWordsAmount);
        driver.quit();
    }

    @Test
    public void testIsEmoptyUniqueWordsAmount() {
        final  String TEXT = " ";
        int expectedWordsAmount = 0;

        WebDriver driver = new ChromeDriver();
        driver.get("https://planetcalc.ru/3204/");
        driver.manage().window().maximize();

        WebElement textArea = driver.findElement(By.id("dialogv6411ef3aee88a_text"));
        textArea.clear();

        driver.findElement(By.id("dialogv6411ef3aee88a_calculate")).click();

        int actualWordsAmount = HW7_Teamwork_27.getUniqueWordsAmount(TEXT);

        Assert.assertEquals(actualWordsAmount, expectedWordsAmount);
        driver.quit();
    }

//        @Test
//        public void testVerifyUniqueWordsAmount() {
//            int expectedWordsAmount = 6;
//
//            WebDriver driver = new ChromeDriver();
//            driver.get("https://planetcalc.ru/3204/");
//            driver.manage().window().maximize();
//
//            WebElement textArea = driver.findElement(By.id("dialogv6411ef3aee88a_text"));
//            textArea.clear();
//            textArea.sendKeys(TEXT);
//
//
//            WebElement button = driver.findElement(By.id("dialogv6411ef3aee88a_calculate"));
//            button.click();
//
//          List<WebElement> actualWordsAmount = driver.findElements
//                            (By.xpath("//div[@id='dialogv6411ef3aee88a_uniqueCount']"));
//          actualWordsAmount.hashCode();
//
//           Assert.assertEquals(actualWordsAmount, expectedWordsAmount);
//            driver.quit();
//        }

}
