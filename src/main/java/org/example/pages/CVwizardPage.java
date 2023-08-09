package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CVwizardPage {

        // Elementos de la página
        private By txtTitulo = By.xpath("//*[text()='Crear un Curriculum Vitae profesional']");

    private WebDriver driver;

    public void iniciarGoogleChrome() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/JLLG37/Desktop/Xacademy/ParapruebasXacademy/FrameworkCV/src/main/resources/chrome/chromedriver.exe");
        driver = new ChromeDriver();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void navegarCVwizard() {
            driver.get("https://www.cvwizard.es/");
    }
    public static void waitForElementToBeClickable(WebDriver driver, By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    // Métodos para maximizar la pantalla
    public void maximizarPantalla() {
        driver.manage().window().maximize();
    }

    // Métodos para imprimir el titulo
    public void imprimirTitulo() {
        waitForElementToBeClickable(driver,txtTitulo,5);
        WebElement titulos = driver.findElement(txtTitulo);
        String titulo = titulos.getText();
        System.out.println("Título: " + titulo);
    }

    // Métodos para imprimir la URL
    public void imprimirURL() {
        String url = driver.getCurrentUrl();
        System.out.println("URL: " + url);
        driver.quit();
    }
}
