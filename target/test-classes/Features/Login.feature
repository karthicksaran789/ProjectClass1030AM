Feature: Verifying OMR Login

Scenario Outline: Verifying valid credentials

Given User is on Omr branch page
When User enters "<username>" and "<password>"
And User clicks the login button
Then User should verfy after Login successful message
	Examples:
			|username|password|
			|Karthick|Karthick@123|
			|Amal|Amal@1234|
			|Surya|Surya@1234|
			
