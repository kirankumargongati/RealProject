Feature: User Login

  Scenario: Successful login
    Given the user is on the nopCommercepage
    When the user enters valid credentials(username: "testing@gmail.com", password: "testing@1234"
    And the user clicks on the login button
    Then the user should be redirected to the My Account page
    And the user should see a welcome message
