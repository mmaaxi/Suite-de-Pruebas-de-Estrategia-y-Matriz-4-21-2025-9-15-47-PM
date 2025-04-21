Feature: Test de navegación en la página principal

  Scenario: Verificar carga y visualización del menú de navegación
    Given el usuario abre la página principal
    Then la página carga correctamente
    And el menú de navegación está visible