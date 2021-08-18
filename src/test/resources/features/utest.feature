# Autor: Deiby Lopez
@stories
Feature: Utest
  As a user, I want to create a user in utest, to test the knowledge learned in choucair academy
  @scenario1
  Scenario Outline: Create a new user in utest
    Given : Than John wants to register as a new user on utest
      When  : he fills out the registration forms
        | strFirstName   || strLastName   || strEmail   || strLanguage   || strCity   ||  strZipCode  ||  strPassword   ||  strMonthBirthday|| strDayBirthday     || strYearBirthday   || strOsComputer   ||  strOsVersion  || strOsLanguage   || strMobileDevice   ||  strModelMobile   || strMobileOs
        | <strFirstName> || <strLastName> || <strEmail> || <strLanguage> || <strCity> || <strZipCode> ||  <strPassword> ||  <strMonthBirthday>|| <strDayBirthday> || <strYearBirthday> || <strOsComputer> || <strOsVersion> || <strOsLanguage> || <strMobileDevice> ||  <strModelMobile> ||<strMobileOs>
      Then  : he will have registered as a new user in utest

    Examples:
      | strFirstName   || strLastName   || strEmail   || strLanguage      || strCity          ||  strZipCode   ||  strPassword         ||  strMonthBirthday      || strDayBirthday     || strYearBirthday   || strOsComputer   ||  strOsVersion  || strOsLanguage   || strMobileDevice   ||  strModelMobile   || strMobileOs
      | John           || Doe           || JohnDoe@test.com || English    || Ciudad de Panama || 0819         ||  HuCr$swiR_7et=Ob_1rI ||        12              ||    04              ||        1996       || Windows         || Windows 10     || English         ||    Apple          ||  11 Pro max       || 14.6
