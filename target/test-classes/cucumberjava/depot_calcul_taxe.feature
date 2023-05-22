@tag
Feature: taxer un depot d'argent
  In order to impose a tax on a deposit
  as a agent
  I want to use compute the taxe to deduct

  @tag1
  Scenario: Taxation normal
    Given the amount is  80.00 
    When i compute te tax of 15.00 %
    Then  total to withdraw is 68.00 
  @tag2
  Scenario Outline: Taxation par categorie
    Given the amount is  <montant_depot> 
    When i compute te tax of <taxe> %
    Then  total to withdraw  <montant_a_retirer>  
    Examples:
    |montant_depot|taxe |montant_a_retirer|
    |60.00        |15.00|51.00            |
    |80.00        |15.00|68.00            |
    |100.00       |15.00|85.00            |
   @tag3
  Scenario: Taxation par categorie low than 150
    Given the amount is  450.00 
    When i select the tax in 
    |1       |"0-100"    |15.00 |100   |
    |2       |"101-150   |20.00 |150   |
    |3       |"151-300"  |25.00 |300   |
    |4       |"301-500"  |30.00 |500   |
    |5       |"501-10000"|35.00 |10000 |
    Then  total to withdraw is 315.00
     @tag4
  Scenario Outline: Taxation pour toutes categories
    Given the amount is  <montant_depot>  
    When i select the tax in 
    |1       |"0-100"    |15.00 |100   |
    |2       |"101-150   |20.00 |150   |
    |3       |"151-300"  |25.00 |300   |
    |4       |"301-500"  |30.00 |500   |
    |5       |"501-10000"|35.00 |10000 |
    Then  total to withdraw  <montant_a_retirer>
    Examples: 
    |montant_depot |montant_a_retirer  |
    |380           | 266 |
    |760           | 494.0 |
    |120           | 96 |
    |60            | 51  |
    |359           | 251.3  |
   
    
   
 