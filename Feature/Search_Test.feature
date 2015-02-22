Feature: Search Action

Scenario: Search for the word TEST
	Given User is on Google Search Page
	When User enters TEST to Search Box
	And User click on Google Search button
	Then Display results
	
Scenario: Verify results
	When User verifies results
	Then Display success message 