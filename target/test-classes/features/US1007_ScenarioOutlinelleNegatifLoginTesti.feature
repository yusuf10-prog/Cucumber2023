Feature: US1007 liste olarak verilen kullanici adi ve sifrelerle giris yapilamadigini test edin

  Scenario Outline: TC11 qualitydemy sayfasina yanlis bilgilerle giris yapilamaz

    Given kullanici "qdUrl" anasyafaya gider
    Then ilk login linkine tiklar
    And username kutusuna examples'dan "<gecersizEmail>" yazar
    And password kutusuna examples'dan "<gecersizPassword>" yazar
    And login butonuna basar
    Then basarili giris yapilamadigini test eder
    And sayfayı kapatır
    Examples:
      | gecersizEmail | gecersizPassword |
      |Suha           |12345             |
      |Nergiz         |34521             |
      |Omer           |7897844           |
      |Mehmet         |94445454599       |
      |Yusuf          |23415134          |
