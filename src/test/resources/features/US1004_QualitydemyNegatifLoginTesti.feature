@smoke
Feature: US1004 Gecersiz bilgilerle giris yapilamaz

  Scenario: TC06 gecerli email, gecersiz password ile giris yapilamaz

    Given kullanici "qdUrl" anasyafaya gider
    Then ilk login linkine tiklar
    And username kutusuna "qdGecerliEmail" yazar
    And password kutusuna "qdGecersizPassword" yazar
    And login butonuna basar
    Then basarili giris yapilamadigini test eder
    And sayfayı kapatır


    Scenario: TC07 gecersiz email, gecerli password ile giris yapilamaz

      Given kullanici "qdUrl" anasyafaya gider
      Then ilk login linkine tiklar
      And username kutusuna "qdGecersizEmail" yazar
      And password kutusuna "qdGecerliPassword" yazar
      And login butonuna basar
      Then basarili giris yapilamadigini test eder
      And sayfayı kapatır

      @metaTest

      Scenario: TC08 gecersiz email, gecersiz password ile giris yapilamaz
        Given kullanici "qdUrl" anasyafaya gider
        Then ilk login linkine tiklar
        And username kutusuna "qdGecersizEmail" yazar
        And password kutusuna "qdGecersizPassword" yazar
        And login butonuna basar
        Then basarili giris yapilamadigini test eder
        And sayfayı kapatır