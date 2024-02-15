package test;


import com.codeborne.selenide.logevents.SelenideLogger;
import config.ConfigReader;
import config.WebConfig;
import config.WebConfigForProject;
import data.TestData;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.*;

import static com.codeborne.selenide.Selenide.closeWebDriver;


public class TestBase {

    MainPage mainPage = new MainPage();
    NavigationPanel navigationPanel = new NavigationPanel();
    BasketPage basketPage = new BasketPage();
    ReturnPage returnPage = new ReturnPage();
    RequestPage requestPage = new RequestPage();
    TestData testData = new TestData();
    SupportPage supportPage = new SupportPage();
    SearchPage searchPage = new SearchPage();
    NewProductsPage newProductsPage = new NewProductsPage();
    ShopHomePage shopHomePage = new ShopHomePage();
    ShopCoffeeProductsPage shopCoffeeProductsPage = new ShopCoffeeProductsPage();
    ItemPage itemPage = new ItemPage();
    private static final WebConfig config = ConfigReader.Instance.read();


    @BeforeAll
    public static void beforeAll() {
        WebConfigForProject webConfigForProject = new WebConfigForProject(config);
        webConfigForProject.webConfig();

    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();

        closeWebDriver();
    }
}