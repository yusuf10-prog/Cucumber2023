Feature: US1006 verilen listedeki urunleri google'de arama

  # verilen listedeki her urunu google'da aratip
  # arama sonuclarinin aranan urun ismini icerdigini test edin


  Scenario Outline: TC10 google'da listedeki urunler aratilabilmeli

    Given kullanici "googleUrl" anasyafaya gider
    And 2 saniye bekler
    Then google da "<istenenKelime>" icin arama yapar
    And google arama sonuclarinin "<istenenKelime>" icerdigini test eder
    And sayfayı kapatır


    Examples:
      | istenenKelime |
      | Nutella       |
      | Java          |
      | Apple         |
      | Samsung       |
      | Wisequarter   |