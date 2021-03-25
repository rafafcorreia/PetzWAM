package pages;

import general.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Product extends Base {

    @FindBy(css = "div.col-md-7.prod-info h1")
    private WebElement productName;

    @FindBy(css = "div.price-current")
    private WebElement productPrice;

    public Product(WebDriver driver) {
        super(driver);
    }

    public String getTitleTab(){
        return driver.getTitle();
    }

    public String readProductName(){
        return productName.getText();
    }

    public String readProductPrice(){
        return productPrice.getText();
    }
}
