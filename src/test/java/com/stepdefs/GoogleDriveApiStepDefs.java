package com.stepdefs;

import com.api.DriveQuickstart;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;
import java.security.GeneralSecurityException;

public class GoogleDriveApiStepDefs {

    @Given("The Client App Build a new authorized Google Drive API client service")
    public void the_client_app_build_a_new_authorized_google_drive_api_client_service()
            throws GeneralSecurityException, IOException {
        DriveQuickstart.buildGoogleDriveApiService();
    }
    @Given("the User chooses a Google Account, inputs credentials, and clicks {string}")
    public void the_user_chooses_a_google_account_inputs_credentials_and_clicks(String buttonName) {

    }
    @Given("the User reviews the permissions on the OAuth consent screen and clicks {string}")
    public void the_user_reviews_the_permissions_on_the_o_auth_consent_screen_and_clicks(String string) {

    }
    @Then("the Client App uses the access token and retrieves User data from Google Drive")
    public void the_client_app_uses_the_access_token_and_retrieves_user_data_from_google_drive()
            throws IOException {
        DriveQuickstart.getFileListFromGoogleDrive();
    }
}
