package test;


import com.codeborne.selenide.logevents.SelenideLogger;
import config.ConfigReader;
import config.WebConfig;
import config.WebConfigForProject;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.MainPage;
import pages.ReturnPage;
import pages.SearchPage;
import pages.SupportPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;


public class TestBase {

    MainPage mainPage = new MainPage();
    ReturnPage returnPage = new ReturnPage();
    SupportPage supportPage = new SupportPage();
    SearchPage searchPage = new SearchPage();

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