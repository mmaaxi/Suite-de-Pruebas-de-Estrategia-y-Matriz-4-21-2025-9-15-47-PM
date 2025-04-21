package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    WebDriver driver;

    By nameField = By.id("name");
    By emailField = By.id("email");
    By messageField = By.id("message");
    By submitButton = By.id("submit");
    By confirmationMessage = By.id("confirmationMessage");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToContactPage() {
        driver.get("https://www.example.com/contact");
    }

    public void fillContactForm(String name, String email, String message) {
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(messageField).sendKeys(message);
    }

    public void submitContactForm() {
        driver.findElement(submitButton).click();
    }

    public boolean isConfirmationMessageDisplayed() {
        return driver.findElement(confirmationMessage).isDisplayed();
    }
}