import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TeamWork_07_Test{

//    private static final String SENTENCE = "мама мыла Раму.";
//    private static final String URL = "https://capitalizemytitle.com/";

    private static final String TEST_SENTENCE = "мама мыла Раму.";



    @Test
    public void testCapitalizeMyTitle_ToSentenceCase() throws InterruptedException {

        // final String expectedResult = new HomeWork_07().printToSentenceCase(SENTENCE);
       // final String expectedResult = new HomeWork_07().printToSentenceCase(TestData.SENTENCE);

        final String expectedResult = new TeamWork_07().printToSentenceCase(TEST_SENTENCE);
        

        WebDriver webDriver = new ChromeDriver();

        //Act

        // webDriver.get(URL); 01
        //webDriver.get(TestData.URL); 02
        webDriver.get(TestData.getURL()); // 03

        //xPath
        // textarea[@id='main_input']

        //css
        // textarea#main_input


        //3 ways to find element by addresses
        webDriver.findElement(By.name("main_input"));
        WebElement textarea = webDriver.findElement(By.xpath("//textarea[@id='main_input']"));
        webDriver.findElement(By.cssSelector("textarea#main_input"));

        textarea.sendKeys(TEST_SENTENCE);

        Thread.sleep(3000);

        WebElement sentenceCaseButton = webDriver.findElement(By.id("sentencecase"));
        sentenceCaseButton.click();

       // webDriver.findElement(By.id("sentencecase")).click();

//        Thread.sleep(3000);

        String actualResult = textarea.getAttribute("value");

        Assert.assertEquals(actualResult, expectedResult);

        // or  webDriver.close();
        webDriver.quit();
    }

    @Test
    public void testToSentenceCaseHappyPath() {
        final String expectedResult = "Мама мыла раму.";

        final String actualResult = new TeamWork_07().printToSentenceCase(TEST_SENTENCE);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Ignore
    @Test
    public void testToSentenceCaseEmptyString() {
        final String sentence = "";
        final String expectedResult = "";

        final String actualResult = new TeamWork_07().printToSentenceCase(sentence);

        Assert.assertEquals(actualResult, expectedResult);

    }
}
