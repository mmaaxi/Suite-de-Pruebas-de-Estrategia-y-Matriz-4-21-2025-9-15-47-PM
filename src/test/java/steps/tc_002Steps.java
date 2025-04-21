package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    WebDriverWait wait;
    tc_002Page contactPage;

    @Given("el usuario está en la página de contacto")
    public void el_usuario_esta_en_la_pagina_de_contacto() {
        // Initialization of the WebDriver and navigating to the contact page
        contactPage = new tc_002Page(driver);
        contactPage.navigateToContactPage();
    }

    @When("el usuario ingresa los datos en el formulario de contacto")
    public void el_usuario_ingresa_los_datos_en_el_formulario_de_contacto() {
        // Entering data in the contact form
        contactPage.fillContactForm("John Doe", "john@example.com", "Mensaje de prueba");
    }

    @When("envía el formulario")
    public void envia_el_formulario() {
        // Submitting the form
        contactPage.submitContactForm();
    }

    @Then("se muestra un mensaje de confirmación de envío")
    public void se_muestra_un_mensaje_de_confirmacion_de_envio() {
        // Verification of the confirmation message
        Assert.assertTrue(contactPage.isConfirmationMessageDisplayed());
    }
}