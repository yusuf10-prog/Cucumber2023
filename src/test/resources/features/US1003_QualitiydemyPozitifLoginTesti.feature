Feature: US1003 kullanici gecerli bilgilerle sayfaya giris yapar

  Scenario: TC05 qualitydemy pozitif login testi

    Given kullanici "qdUrl" anasyafaya gider
    Then ilk login linkine tiklar
    And username kutusuna "qdGecerliEmail" yazar
    And password kutusuna "qdGecerliPassword" yazar
    And login butonuna basar
    Then basarili giris yapildigini test eder
    And sayfayı kapatır