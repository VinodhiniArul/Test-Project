@FacebookList
Feature: Facebook Account Creation
Scenario: Account Creation
Given Launch Applicatioin  "https://www.facebook.com/"
When Click On Create New Account
And user enter firstname one dim value
| vinodhini |
| divya     |
| kavin     |
And user enter lastname one dim value
| raj       |
| priya     |
| vasan     |
And user enter DOB one dim value
|25|
|Jan|
|1995|
And user enter gender
|Female|
|Male|
|Custom|
And user enter email id
| vinodhini.raj@gmail.com |
| divya.priya@gmail.com   |
| kavin.vasan@gmail.com   |
And user enter password
| Vino@123   |
| Divya@456  |
| Kavin@789  |
And user close browser
