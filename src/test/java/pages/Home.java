package pages;

import general.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Base {

    @FindBy(id = "search")
    private WebElement inputSearchTextBox;

    @FindBy(className = "button-search")
    private WebElement submitSearchButton;


    public Home(WebDriver driver){
        super(driver);
    }

    public void selectSearch(String stringProductSearch){
        inputSearchTextBox.click();
        inputSearchTextBox.clear();
        inputSearchTextBox.sendKeys(stringProductSearch);
    }

    public void searchWithMagnifierButton(String stringProductSearch){
        selectSearch(stringProductSearch);
        submitSearchButton.click();
    }

    public void searchWithEnter(String stringProductSearch){
        selectSearch(stringProductSearch);
        inputSearchTextBox.sendKeys(Keys.ENTER);
    }

}
