package model;

import org.openqa.selenium.By;

public class HomeWork {

    //google.com locators
    private final By SEARCH_LINE = By.id("RNNXgb");
    private final By QUANTITY_RESULT = By.id("result-stats");
    private final By SORTING = By.id("hdtb-tls");
    private final By SETTINGS = By.id("_JeR2ZdvnHK6K9u8P3t2MsAw_5");
    private final By GOOGLE_ACCOUNT_BTN = By.className("gb_za gb_jd gb_Ld gb_j gb_ie");
    private final By FOUND_ELEMENT_DESCRIPTION = By.className("RvIhPd");
    private final By FULL_DESCRIPTION_OF_FOUNDED_ELEMENT = By.xpath(".//div[@class = 'I6TXqe']");

    //amazon.de locators
    private final By WEB_LOGO = By.id("nav-logo");
    private final By SEARCH_BAR = By.id("twotabsearchtextbox");
    private final By PRODUCT_SELECTION = By.className("hm-icon-label");
    private final By USERS_ACCOUNT = By.id("nav-link-accountList");
    private final By SHOPPING_CART = By.id("nav-cart");
    private final By NEXT_ADVERTISING = By.xpath(".//div[contains(@class, 'a-carousel-col a-carousel-right celwidget')]");
    private final By PROFITABLE_OFFERS = By.xpath(".//div[contains(@class, 'a-cardui deal-of-the-day')]");

    //booking.com locators
    private final By LOGO = By.xpath(".//a[@data-testid = 'header-booking-logo']");
    private final By TRANSFER = By.id("airport_taxis");
    private final By CURRENCY_SELECTION = By.xpath(".//span[contains(@class, 'e4adce92df')]");
    private final By ACCOUNT = By.xpath(".//span[contains(@class, 'e4adce92df']");
    private final By WELCOME_BANNER = By.xpath(".//span[@data-testid, 'herobanner-title1']");
    private final By DATE_OF_CHECK_IN_OUT = By.xpath(".//div[contains(@class, 'e22b782521')]");
    private final By SEARCH_BTN = By.xpath(".//div[contains(@class, 'e22b782521 d12ff5f5bf')]");
    private final By TRAVEL_FOR_WORK = By.xpath(".//div[contains(@class, 'a53cbfa6de ac9267e216 d8eb520c4e')]");
    private final By POPULAR_DESTINATIONS = By.xpath(".//div[contains(@class, 'af8fbdf136 e6208ee469 d0caee4251')]");

    //1a.lv locators
    private final By TRADEMARK = By.xpath(".//a[contains(@class, 'main-logo')]");
    private final By SMART_NET_BANNER = By.xpath(".//img[contains(@class, 'smart-net-banner__logo')]");
    private final By MENU_BTN = By.xpath(".//i[contains(@class, 'main-menu__handle-icon icon-svg')]");
    private final By PICK_UP_POINTS = By.xpath(".//a[contains(@class, 'site-top__menu-right-link')]");
    private final By LANGUAGE_SELECTION = By.className("site-top__menu-right-link language");
    private final By SHOP_CART = By.xpath(".//div[contains(@class, 'cart-block')]");
    private final By REGISTRATIONS = By.xpath(".//img[contains(@class, 'smart-net-banner__image')]");
}