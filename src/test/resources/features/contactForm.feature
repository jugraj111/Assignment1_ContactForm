Feature: Automate the submission of the contact form on SkillUp Automation site

  Scenario: Fill information in contact form and submit it
    Given navigate to the contact form
    When user enter his,her name
    And user enter valid email
    And user enter message
    And Click on submit button
    Then verify information submitted successfully