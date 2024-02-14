package com.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "html:target/default-cucumber-reports.html",
                "rerun:target/rerun.text"},

        features = "src/test/resources/features",
        glue = "com/stepdefs",
        dryRun = false,
        publish = true,

        tags = "@GoogleDriveApi"

)
public class CukesRunner {


}
