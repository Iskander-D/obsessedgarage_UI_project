package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
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
import pages.NavigationPanel;

import static com.codeborne.selenide.Selenide.closeWebDriver;


public class TestBase {

    MainPage mainPage = new MainPage();
    NavigationPanel navigationPanel = new NavigationPanel();
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