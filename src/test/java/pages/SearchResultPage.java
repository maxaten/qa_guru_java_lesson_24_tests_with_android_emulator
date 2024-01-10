package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.*;

public class SearchResultPage {
    private ElementsCollection elementsGroup = $$(className("android.view.ViewGroup")),
            lineSearch = $$(id("org.wikipedia.alpha:id/page_list_item_title"));


    public void clickOnFirstSearch() {
        elementsGroup.get(1).click();
    }

    public void checkElementInList() {
        lineSearch.shouldHave(sizeGreaterThan(0));
    }

}
