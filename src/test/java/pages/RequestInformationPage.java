package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class RequestInformationPage {

    private SelenideElement label = $(xpath("//android.webkit.WebView[@text='Batman']"));


    public RequestInformationPage checkVisible() {
        label.shouldHave(visible);
        return this;
    }

    public RequestInformationPage checkText(String value) {
        label.shouldHave(text(value));
        return this;
    }
}
