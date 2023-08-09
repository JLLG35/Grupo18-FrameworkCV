Feature: Navegación en CVwizard

  @TestReport
  Scenario: Navegar por la página y maximizar la pantalla
    Given Iniciar la página de CVwizard
    When Se maximiza la pantalla
    Then Se imprime el título
    And Se imprime la URL