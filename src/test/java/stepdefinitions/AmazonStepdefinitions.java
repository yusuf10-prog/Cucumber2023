package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefinitions {

    AmazonPage amazonPage;
    @Given("kullanici amazonUrl anasyafaya gider")
    public void kullanici_amazon_url_anasyafaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Given("arama kutusuna Nutella yazip aratir")
    public void arama_kutusuna_nutella_yazip_aratir() {

        amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

    }
    @Then("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {

        amazonPage=new AmazonPage();
        String expectedIcerik="Nutella";
        String actualAramaSonucu=amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));

    }
    @Then("sayfayı kapatır")
    public void sayfayı_kapatır() {
        Driver.closeDriver();

    }

    @Given("arama kutusuna Java yazip aratir")
    public void arama_kutusuna_java_yazip_aratir() {
        amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);

    }
    @Then("arama sonuclarinin Java icerdigini test")
    public void arama_sonuclarinin_java_icerdigini_test() {
        amazonPage=new AmazonPage();
        String expectedIcerik="Java";
        String actualAramaSonucu=amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));

    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int saniye) throws InterruptedException {
        Thread.sleep(saniye*1000);
    }

    @Given("kullanici {string} anasyafaya gider")
    public void kullaniciAnasyafayaGider(String istenenUrl) {
        amazonPage=new AmazonPage();

        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
    @Then("arama kutusuna {string} yazip aratir")
    public void aramaKutusunaYazipAratir(String arananUrun) {
        amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(arananUrun+Keys.ENTER);
    }
    @And("arama sonuclarinin {string} icerdigini test")
    public void aramaSonuclarininIcerdiginiTest(String arananUrun) {
        amazonPage=new AmazonPage();
        String actualSonucYazisi=amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(arananUrun));
    }

    @Then("ilk urunu tiklar")
    public void ilkUrunuTiklar() {
        amazonPage.ilkUrunElementi.click();
        
    }

    @And("urun isminin {string} icerdigini test eder")
    public void urunIsmininIcerdiginiTestEder(String arananUrun) {

        String actualIlkIsmi=amazonPage.ilkUrunIsimElementi.getText();
        Assert.assertTrue(actualIlkIsmi.contains(arananUrun));

    }
}
