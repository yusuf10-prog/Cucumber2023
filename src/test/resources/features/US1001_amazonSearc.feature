
  Feature: US1001 Kullanici amazon anasayfada arama yapar

    Scenario: TC01 Kullanici amazonda Nutella aratir

      Given kullanici amazonUrl anasyafaya gider
      And arama kutusuna Nutella yazip aratir
      Then arama sonuclarinin Nutella icerdigini test eder
      And sayfayı kapatır


      Scenario: TC02 Kullanici amazonda Java aratir
        Given kullanici amazonUrl anasyafaya gider
        And arama kutusuna Java yazip aratir
        Then arama sonuclarinin Java icerdigini test
        And 2 saniye bekler
        And sayfayı kapatır
