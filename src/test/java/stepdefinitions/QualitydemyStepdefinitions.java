package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class QualitydemyStepdefinitions {

    QualitydemyPage qualitydemyPage=new QualitydemyPage();

    @Then("ilk login linkine tiklar")
    public void ilk_login_linkine_tiklar() {

        qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
    }
    @Then("username kutusuna {string} yazar")
    public void username_kutusunu_yazar(String kullaniciEmail) {
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty(kullaniciEmail));

    }
    @Then("password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String password) {
        qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty(password));
    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.loginButonu.submit();
    }
    @Then("basarili giris yapildigini test eder")
    public void basarili_giris_yapildigini_test_eder() {
        Assert.assertTrue(qualitydemyPage.basariliGirisElementi.isDisplayed());

    }

    @Then("basarili giris yapilamadigini test eder")
    public void basariliGirisYapilamadiginiTestEder() {
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
    }

    @And("username kutusuna examples'dan {string} yazar")
    public void usernameKutusunaExamplesDanYazar(String kullaniciEmail) {

        qualitydemyPage.emailKutusu.sendKeys(kullaniciEmail);
    }

    @And("password kutusuna examples'dan {string} yazar")
    public void passwordKutusunaExamplesDanYazar(String kullaniciPassword) {
        qualitydemyPage.passwordKutusu.sendKeys(kullaniciPassword);
    }
}
