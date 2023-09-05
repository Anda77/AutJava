package com.github.savkk.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleStepDefs {
    @Given("first step")
    public void firstStep() {
        System.out.println("first step");
        System.out.println(System.getenv("TEST_DATA"));
        System.out.println(System.getProperty("TEST_DATA"));
    }


    @When("second step")
    public void secondStep() {
        System.out.println("second step");
    }


    @Then("third step")
    public void thirdStep() {
        System.out.println("third step");
    }

}
