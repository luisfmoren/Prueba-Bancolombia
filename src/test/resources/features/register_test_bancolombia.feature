#autor: luis moreno

  @stories
  Feature: Test Bancolombia
    as a user, I want to create a new register in the page utest.com

  @scenario1
  Scenario: Create a new register
    Given than luis wants to create a new register
    When he entry your information
    |strFirstName|strLastName|strEmail                |strMonth|strDay|strYear|strCity |strZip|strPassword |
    |luis        |Moreno     |luismoreno7700@gmail.com|August  |7     |1997   |Bello   |050018|LuisMoreno77|
    Then he will have a new register in the page
    |strText                                             |
    |Welcome to the world's largest community of testers.|