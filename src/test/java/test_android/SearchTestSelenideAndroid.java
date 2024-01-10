package test_android;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import pages.OnboardingPage;
import pages.RequestInformationPage;
import pages.SearchPage;
import pages.SearchResultPage;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class SearchTestSelenideAndroid extends TestBase {


    private OnboardingPage onboardingPage = new OnboardingPage();
    private SearchPage searchPage = new SearchPage();

    private SearchResultPage searchResultPage = new SearchResultPage();

    private RequestInformationPage informationPage = new RequestInformationPage();


    String name1 = "Appium";

    @Test
    @Tags({@Tag("browserstack "), @Tag("regress")})
    void successfulSearchTestBrowserstack() {


        step("Кликнуть по полю поиска", () -> {
            searchPage.clickOnSearch();
        });

        step(String.format("Вставить значение %s", name1), () -> {
            searchPage.clickOnSecondSearch(name1);
        });

        step("Проверка искомого запроса", () -> {
            searchResultPage.checkElementInList();
        });
    }


    @Test
    @Tags({@Tag("regress"), @Tag("emulator")})
    void successfulSearchTest() {


        back();
        step("Кликнуть по полю поиска", () -> {
            searchPage.clickOnSearch();
        });

        step(String.format("Вставить значение %s", name1), () -> {
            searchPage.clickOnSecondSearch(name1);
        });

        step("Проверка искомого запроса", () -> {
            searchResultPage.checkElementInList();
        });
    }

    @Test
    @Tag("emulator")
    void successfulSearchAndClickTest() {

        String name2 = "Batman";

        back();
        step("Кликнуть по полю поиска", () -> {
            searchPage.clickOnSearch();
        });

        step(String.format("Вставить значение %s", name2), () -> {
            searchPage.clickOnSecondSearch(name2);
        });

        step(String.format("Выбрать элемент %s в списке", name2), () -> {
            searchResultPage.clickOnFirstSearch();
        });

        step(String.format("Выбрать элемент %s в списке", name2), () -> {
            informationPage.checkVisible()
                    .checkText(name2);
        });
    }

    @Test
    @Tag("emulator")
    @DisplayName("Проверка текстов на экранах онбординга")
    void checkOnboardingTest() {
        step("Проверка первого экрана", () -> {
            onboardingPage.checkPrimaryText("The Free Encyclopedia …in over 300 languages")
                    .checkSecondaryText("We’ve found the following on your device:")
                    .checkOptionLabel("1. English")
                    .checkLanguageButtonText("Add or edit languages")
                    .continueButtonClick();
        });
        step("Проверка второго экрана", () -> {
            onboardingPage.checkPrimaryText("New ways to explore")
                    .checkSecondaryText("Dive down the Wikipedia rabbit hole with a constantly updating " +
                            "Explore feed. Customize the feed to your interests – whether it’s learning about historical " +
                            "events On this day, or rolling the dice with Random.")
                    .continueButtonClick();
        });
        step("Проверка третьего экрана", () -> {
            onboardingPage.checkPrimaryText("Reading lists with sync")
                    .checkSecondaryText("You can make reading lists from articles you want to read later, " +
                            "even when you’re offline. Login to your Wikipedia account to sync your reading lists. " +
                            "Join Wikipedia")
                    .continueButtonClick();
        });
        step("Проверка четвертого экрана", () -> {
            onboardingPage.checkPrimaryText("Send anonymous data")
                    .checkSecondaryText("Help make the app better by letting us know how you use it. " +
                            "Data collected is anonymous. Learn more")
                    .checkRejectButtonText("Reject")
                    .checkAcceptButtonText("Accept");
        });
    }
}
