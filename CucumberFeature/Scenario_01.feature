Feature: Test USM Smoke Scenarios
	Scenario: Test login with valid credentials
		Given Open chrome and start application
		When Enter valid username and valid password
		Then User should be able to login successfully 