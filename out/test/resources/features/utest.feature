# Autor: Deiby Lopez
@stories
Feature: Utest
  As a user, I want to create a user in utest, to test the knowledge learned in choucair academy
  @scenario1
  Scenario Outline: Create a new user in utest
    Given : Than John wants to register as a new user on utest
      | strUser  | strPassword   |
      | <strUser>| <strPassword> |
      When  : he fills out the registration forms
        | strCourse  |
        | <strCourse>|
      Then  : he will have registered as a new user in utest
        | strCourse  |
       | <strCourse>|

    Examples:
      | strUser  | strPassword   || strCourse  |
      | brandom| Febrero.2020 || Recusos Automatizacion Bancolombia|