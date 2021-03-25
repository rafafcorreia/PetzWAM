package pages;

import general.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class List extends Base {

    public List(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "h1.h2Categoria.nomeCategoria")
    private WebElement labelResultBy;

    public String readTabTitle(){
        return driver.getTitle();
    }

    public void clickProduct(String product){
        driver.findElement(By.cssSelector("img[title='" + product + "']")).click();
    }

    public String readResultBy(){
        return labelResultBy.getText();
    }

}
