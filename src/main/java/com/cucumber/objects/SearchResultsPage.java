package com.cucumber.objects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SearchResultsPage extends SearchTicketsForm{

    private String tabInfo = startStation + " to " + finishStation;
    private By searchResultsPageInfoTab = By.xpath("//*[@id=\"tabs\"]");
    private By inboundResultsFirstItem = By.xpath("//*[@id=\"legs\"]/div[1]/div/div[2]/ul/li[1]");

    public void userCanSeeSearchResults(){
        $(searchResultsPageInfoTab).shouldHave(text(tabInfo));
        $(inboundResultsFirstItem).waitUntil(visible, 20000);
    }
}
