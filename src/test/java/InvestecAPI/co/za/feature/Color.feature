Feature:  As a QA, checking the given name correspond to the color in the API list

  Scenario: The User is given a public API Endpoint where he/she needs to check whether color white and blue correspond to R2-D2
    Given User verifies the HTTP status
    Then User checks whether the name correspond skin color is white and blue
#    Then User verifies GBP is shown in the response