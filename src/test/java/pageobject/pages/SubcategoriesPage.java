package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

public class SubcategoriesPage {
    private final By SUBCATEGORY_NAME = By.xpath(".//span[@class = 'cat-title']");
    private BaseFunc baseFunc;

    public SubcategoriesPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void selectSubcategory(String subcategoryName) {
//        Home work: Add flag here and assertion after the loop
        for (WebElement we: baseFunc.findElements(SUBCATEGORY_NAME)) {
            if (we.getText().equals(subcategoryName)) {
                baseFunc.scrollToElement(we);
                we.click();
                break;
            }
        }
    }
}
