Feature: Facebook Login feature

  @smoketest
  Scenario: Facebook Login Test scenarios
    Given User is already on the login Page
    When Title of the Login Page is Facebook|Login
    Then User enters Username and Password
    Then User clicks on Login button
    And User is on HomePages
    Then Close the Browser

  Scenario Outline: Facebook Login Test scenarios
    Given User is already on the login Page
    When Title of the Login Page is Facebook|Login
    Then User enters "<Username>" and "<Password>"
    Then User clicks on Login button
    And User is on HomePages
    Then Close the Browser
    Examples:
      | Username  | Password |
      | bhumikajain@gmail.com  | Kumi123@ |
      | Revathi@gmail.com  | Rev123@ |
      | Mona@gmail.com  | Mona5123@ |

    @regression
  Scenario Outline: Facebook Login Test scenarios
    Given User is already on the login Page
    When Title of the Login Page is Facebook|Login
    Then User enters "<Username>" and "<Password>"
    Then User clicks on Login button
    And User is on HomePages
    Then Close the Browser
    Examples:
      | Username  | Password |
      | mayavishal@gmail.com  | mava123@ |
      | Donald@gmail.com  | Donald5123@ |
