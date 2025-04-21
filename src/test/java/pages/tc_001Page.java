package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tc_001Page {

    private WebDriver driver;
    private By menuDeNavegacion = By.id("menu");

    public Tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void abrirPaginaPrincipal() {
        driver.get("https://www.example.com");
    }

    public boolean estaPaginaCargada() {
        return driver.getTitle().contains("Inicio");
    }

    public boolean esMenuDeNavegacionVisible() {
        return driver.findElement(menuDeNavegacion).isDisplayed();
    }
}