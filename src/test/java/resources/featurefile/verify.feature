Feature: Verify the job search result
  As a user I want verify the search result of job

  Scenario Outline: Verify job search result using different data set
    Given I am on home page
    When I accept cookies
    And I enter job title "<jobTitle>"
    And I enter location "<location>"
    And I select distance "<distance>"
    And I click on more search option
    And I enter minimum salary "<salaryMin>"
    And I enter maximum salary "<salaryMax>"
    And I select salary type "<salaryType>"
    And I select job type "<jobType>"
    And I click on find jobs button
    Then I should see the job search result "<result>"

    Examples:
      | jobTitle  | location | distance | salaryMin | salaryMax | salaryType | jobType   | result                             |
      | Tester    | Harrow   | 5 miles  | 30000     | 500000    | Per annum  | Permanent | Permanent Tester jobs in Harrow    |
      | Developer | Milton   | 50 miles | 70000     | 75000     | Per annum  | Permanent | Permanent Developer jobs in Milton |
      | Engineer  | London   | 10 miles | 60000     | 70000     | Per annum  | Permanent | Permanent Engineer jobs in London  |
      | Tester    | Wembley  | 10 miles | 30000     | 35000     | Per annum  | Permanent | Permanent Tester jobs in Wembley   |
      | Driver    | Wembley  | 15 miles | 35000     | 40000     | Per annum  | Permanent | Permanent Driver jobs in Wembley   |