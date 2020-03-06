package Tests;
import com.codeborne.selenide.*;
import com.codeborne.selenide.impl.WebElementWrapper;
import com.codeborne.selenide.impl.WebElementsCollectionWrapper;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


import static  com.codeborne.selenide.Selenide.*;

public class SomeTest{

    @BeforeAll
    static void SetUp(){
        Selenide.open("https://comfy.ua/");
    }

    // @AfterAll
    //static void Close(){
    //closeWebDriver();
    //}

    @Test
    void quantityOfSeachedElements(){

        $(By.id("searchTop")).setValue("палатка").pressEnter();

        Selenide.sleep(20000);

        int totalQuantity=0;
        ArrayList<SelenideElement> allPagesPriceList = new ArrayList<SelenideElement>();
        allPagesPriceList.addAll($$(By.className("price-box__content-i")));
        System.out.println(allPagesPriceList.size());
        while ($(By.partialLinkText("ВПЕРЕД")).exists()) {
            $(By.partialLinkText("ВПЕРЕД")).click();
            Selenide.sleep(10000);
            allPagesPriceList.addAll($$(By.className("price-box__content-i")));

        }
        totalQuantity=allPagesPriceList.size();
        System.out.println(totalQuantity+" totalQuantity");
        String actualQuantityText = $(By.id("productsCount")).getText();
        System.out.println(actualQuantityText+ " actualQuantityText");
        int idOfWhiteSpace = actualQuantityText.indexOf(" ");

        actualQuantityText = actualQuantityText.substring(0, idOfWhiteSpace);
        System.out.println(actualQuantityText+ " substring actualQuantityText");

        int actualQuantity = Integer.parseInt(actualQuantityText);

        System.out.println(actualQuantity + " actualQuantityInt");

        Assertions.assertTrue(totalQuantity==actualQuantity);

        Selenide.sleep(20000);
    }
/** does not work
    @Test
    void descendingPrice(){

        $(By.id("searchTop")).setValue("палатка").pressEnter();

        Selenide.sleep(20000);

        ArrayList<SelenideElement> allPagesPriceList = new ArrayList<SelenideElement>();
        allPagesPriceList.addAll($$(By.className("price-box__content-i")));
        Selenide.sleep(20000);
        while ($(By.partialLinkText("ВПЕРЕД")).exists()) {
            $(By.partialLinkText("ВПЕРЕД")).click();
            Selenide.sleep(10000);
            allPagesPriceList.addAll($$(By.className("price-box__content-i")));
        }
        System.out.println(allPagesPriceList.size()+" total");

        int quantity = allPagesPriceList.size();

        System.out.println(allPagesPriceList);

        for (int i=0; i<quantity; i++) {
            System.out.println(allPagesPriceList.get(i).getText());
        }
        System.out.println();
        System.out.println(allPagesPriceList.size());
        $(By.className("category-sort__list-wr")).click();
        $(By.id("1")).click();
        /**
        for (SelenideElement i:allPagesPriceList) {
            System.out.println(allPagesPriceList.get(i).getText());

        }
        System.out.println(allPagesPriceList.get(20).getText());
        System.out.println(allPagesPriceList.get(21).getText());
        System.out.println(allPagesPriceList.get(22).getText());
        System.out.println(allPagesPriceList.get(23).getText());

        Assertions.assertTrue(allPagesPriceList.size()>0);

        Selenide.sleep(20000);
    }**/


@Test
void addToCart() {

//    $(By.id("searchTop")).setValue("палатка").waitUntil(Condition.text("палатка"), 10000).click();

    $(By.id("searchTop")).setValue("палатка");
    Selenide.sleep(20000);
    $(By.id("searchTop")).pressEnter();

    Selenide.sleep(20000);

    //$(By.className("product-item__img-wr")).click();
    $(By.linkText("Палатка Mousson DELTA 3 KHAKI")).click();
    Selenide.sleep(20000);

    $(By.className("btn-wr")).click();

    Selenide.sleep(20000);

    List<SelenideElement> cartList = $$(By.className("minicart-popup-item__name-wr"));
    System.out.println(cartList);
    String e = cartList.toString();
    Assertions.assertTrue(e.contains("Палатка Mousson DELTA 3 KHAKI"));
/**
    $(By.className("fancybox-overlay fancybox-overlay-fixed"));
    $(By.className("features__cols _left")).shouldBe(Condition.visible);

    $(By.className("header-logo header__item hide-on-mobile")).click();
    $(By.className("slick-track")).shouldBe(Condition.visible);
    $(By.className("header-cart-wrap")).click();
    $(By.id("minicartPopupForm")).shouldBe(Condition.visible);

    List<SelenideElement> cartList2 = $$(By.className("minicart-popup-item__name-wr"));
    System.out.println(cartList);
    String e2 = cartList2.toString();
    Assertions.assertTrue(e2.contains("Палатка Mousson DELTA 3 KHAKI"));
    //Assertions.assertTrue(((ElementsCollection) cartList).shouldHave(CollectionCondition.texts("Палатка Mousson DELTA 3 KHAKI")));
    //texts("Палатка Mousson DELTA 3 KHAKI");
    //.contains("Палатка Mousson DELTA 3 KHAKI"));
**/
/**
    System.out.println($$(By.className("minicart-popup-item__name-wr")));
    List<SelenideElement> cartList = $$(By.className("minicart-popup-item__name-wr"));
Assertions.assertTrue(cartList.contains("Палатка Mousson DELTA 3 KHAKI"));
    String quantityInCart =  $(By.id("cartHeaderQty")).getText();
    System.out.println(quantityInCart);

    //$(By.className("fancybox-item fancybox-close")).shouldBe(Condition.visible).click();
   // $(By.className("header-logo header__item hide-on-mobile"));
 **/
}
}


