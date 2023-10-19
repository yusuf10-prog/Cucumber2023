
Feature: US1002 Kullanici parametre olarak yazdigi urunu amazonda aratir

  Scenario: TC03 parametre ile amazonda arama
    Given kullanici "amazonUrl" anasyafaya gider
    Then arama kutusuna "Java" yazip aratir
    And arama sonuclarinin "Java" icerdigini test
    Then 2 saniye bekler
    And sayfayı kapatır

    Scenario: TC04 parametre ile apple aratir
      Given kullanici "amazonUrl" anasyafaya gider
      Then arama kutusuna "apple" yazip aratir
      And arama sonuclarinin "apple" icerdigini test
      Then 5 saniye bekler
      And sayfayı kapatır
