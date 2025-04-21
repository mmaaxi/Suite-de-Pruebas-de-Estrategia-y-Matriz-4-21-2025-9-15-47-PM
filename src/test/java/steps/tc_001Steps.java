package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.Tc_001Page;

public class Tc_001Steps {

    private WebDriver driver;
    private Tc_001Page page;

    public Tc_001Steps() {
        this.driver = Hooks.getDriver();
        this.page = new Tc_001Page(driver);
    }

    @Given("el usuario abre la página principal")
    public void abrirPaginaPrincipal() {
        page.abrirPaginaPrincipal();
    }

    @Then("la página carga correctamente")
    public void verificarPaginaCargaCorrectamente() {
        Assert.assertTrue(page.estaPaginaCargada());
    }

    @Then("el menú de navegación está visible")
    public void verificarMenuDeNavegacionVisible() {
        Assert.assertTrue(page.esMenuDeNavegacionVisible());
    }
}