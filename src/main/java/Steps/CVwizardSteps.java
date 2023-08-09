package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.CVwizardPage;

public class CVwizardSteps {
    CVwizardPage CVwizardPage = new CVwizardPage();

    @Given("Iniciar la página de CVwizard")
    public void iniciarLaPáginaDeCVwizard() {
        CVwizardPage.iniciarGoogleChrome();
        CVwizardPage.navegarCVwizard();
    }

    @When("Se maximiza la pantalla")
    public void seMaximizaLaPantalla()  {
        CVwizardPage.maximizarPantalla();
    }

    @Then("Se imprime el título")
    public void seImprimeElTitulo()   {
        CVwizardPage.imprimirTitulo();
    }

    @And("Se imprime la URL")
    public void seImprimeLaUrl()   {
        CVwizardPage.imprimirURL();
    }


}
