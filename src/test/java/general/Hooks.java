package general;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Base{
    private final Base base;

    //Construtor para a classe Base
    public Hooks(Base base){
        super(base.driver);
        this.base = base;
    }

    @Before
    public void setup(){
        // Indicação da localização do ChromeDriver
        System.setProperty("webDriver.chrome.driver", "drivers/chrome/88_chromedriver.exe");

        //Instancia o ChromeDriver
        driver = new ChromeDriver();

        //Maximizar a tela
        driver.manage().window().maximize();

        //Define tolerância de espera de 1 minuto
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);

        //Acessa o endereço url
        driver.get("https://www.petz.com.br/");
    }

    @After
    public void tearDown(){
        base.driver.quit();
    }
}
