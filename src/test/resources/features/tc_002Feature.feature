Feature: Test de envío de formulario de contacto

  Scenario: Enviar formulario de contacto satisfactoriamente
    Given el usuario está en la página de contacto
    When el usuario ingresa los datos en el formulario de contacto
    And envía el formulario
    Then se muestra un mensaje de confirmación de envío