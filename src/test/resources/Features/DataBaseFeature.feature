Feature: DataBase SQL query Feature Sceneario



@testDB
Scenario: Execute all information from actor table
 	Given User connects to PostgreSql Database
 	When User sends querry 'select * from public.actor'
 	Then User should get all information from that table