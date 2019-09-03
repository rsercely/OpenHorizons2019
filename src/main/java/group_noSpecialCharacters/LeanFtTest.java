package group_noSpecialCharacters;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.web.*;
import com.hp.lft.verifications.*;

import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {

    public LeanFtTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new LeanFtTest();
        globalSetup(LeanFtTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws GeneralLeanFtException {
        Browser browser = BrowserFactory.launch(BrowserType.CHROME);

        browser.navigate("http://advantageonlineshopping.com/");

        Link tabletsCategoryTxtLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("TABLETS")
                .tagName("SPAN").build());
        tabletsCategoryTxtLink.click();

        WebElement hPElitePad1000G2TabletWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .innerText("HP ElitePad 1000 G2 Tablet")
                .tagName("A").build());
        hPElitePad1000G2TabletWebElement.click();

        EditField quantityEditField = browser.describe(EditField.class, new EditFieldDescription.Builder()
                .name("quantity")
                .tagName("INPUT")
                .type("text").build());
        quantityEditField.setValue("2");

        Button saveToCartButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("ADD TO CART")
                .tagName("BUTTON").build());
        saveToCartButton.click();

        WebElement menuCartWebElement = browser.describe(Link.class, new LinkDescription.Builder()
                .accessibilityName("ShoppingCart")
                .innerText(new RegExpProperty("\\d*"))
                .role("link")
                .tagName("A").build())
                .describe(WebElement.class, new WebElementDescription.Builder()
                        .accessibilityName("")
                        .id("menuCart")
                        .innerText("")
                        .tagName("svg").build());
        menuCartWebElement.click();

        My1stAM appModel = new My1stAM(browser);
        appModel.CheckOutBtnButton().click();
        appModel.UsernameInOrderPaymentEditField().setValue("Robert says");
        appModel.PasswordInOrderPaymentEditField().setValue("hello");
        appModel.LoginBtnundefinedButton().click();
        browser.back();
        appModel.REMOVEWebElement().click();

        Link hOMELink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("HOME")
                .tagName("A").build());
        hOMELink.click();


    }

}