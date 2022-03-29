package us.gotcurio.achmadns.cucumber;

import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java.en.When;

public class Action {
  @Autowired
  ScenarioContext context;

  @Autowired
  Calculator calculator;

  @When("X plus y is calculated")
  public void calculate() {
    context.setResult(calculator.add(context.getX(), context.getY()));
  }
}
