package tests;

import lib.CoreTestCase;
import lib.ui.SearchPageObject;
import org.junit.Test;

public class SearchTests extends CoreTestCase {

    @Test
    public void testSearch()
    {
        SearchPageObject SearchPageObject = new SearchPageObject(driver);

        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Minecraft");
        SearchPageObject.getAmountOfFoundArticles();

        SearchPageObject.waitForElementByTitleAndDescription("Minecraft", "2011 video game");
        SearchPageObject.waitForElementByTitleAndDescription("Minecraft: Story Mode", "2015 video game");
        SearchPageObject.waitForElementByTitleAndDescription("Minecraft (franchise)", "Media franchise");
    }
}
