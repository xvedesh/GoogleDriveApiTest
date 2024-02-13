Feature: Build a new authorized Google Drive API client service

  Scenario: As a User, I want to authorize the Client App to access Google Drive API through OAuth to interact with my Google Drive data
    Given The Client App Build a new authorized Google Drive API client service
    And the User chooses a Google Account, inputs credentials, and clicks "Continue"
    And the User reviews the permissions on the OAuth consent screen and clicks "Continue"
    Then the Client App uses the access token and retrieves User data from Google Drive

