package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        tags = "@manager or @driver"
        //tags = "@student"
        //tags = "@student or @librarian"
        //tags = "@student and @librarian"
        //tags = "@student and not @librarian"
)
public class CukesRunner {
}

