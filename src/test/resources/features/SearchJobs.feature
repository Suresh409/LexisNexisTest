Feature: Search Jobs

  @SearchJobs
  Scenario Outline: Check User able to search jobs on career page

    Given I am on LexisNexis Home page
    Then I Navigate to Careers
    Then I Click on SearchAll Jobs
    When I Search Job as "<JobToSearch>"
    Then I Can see the results

  Examples:
  |JobToSearch|
  |automation tester|
  |Dummy            |




