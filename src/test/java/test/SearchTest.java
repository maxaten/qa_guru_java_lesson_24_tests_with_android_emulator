package test;

import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import pages.RequestInformationPage;
import pages.SearchPage;
import pages.SearchResultPage;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class SearchTest extends TestBase {


    private SearchPage searchPage = new SearchPage();
    private SearchResultPage searchResultPage = new SearchResultPage();
    private RequestInformationPage informationPage = new RequestInformationPage();


    String name1 = "Appium";


    @Test
    @Owner("Bruce")
    @Story("Wikia")
    @Feature("Поиск")
    @Issue("HOMEWORK-1043")
    @DisplayName("Проверка поиска")
    @Tags({@Tag("smoke"), @Tag("regress")})
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
    @Owner("Bruce")
    @Story("Wikia")
    @Feature("Поиск")
    @Issue("HOMEWORK-1043")
    @DisplayName("Проверка искомого запроса в статье")
    @Tags({@Tag("smoke"), @Tag("regress")})
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

        step(("Искомый запрос в статье присутствует"), () -> {
            informationPage.checkVisible()
                    .checkText(name2);
        });
    }
}
