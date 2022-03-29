package us.gotcurio.achmadns.cucumber;

import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java.en.When;

public class Actions {
  @Autowired
  ScenarioContext context;

  @Autowired
  Calculator calculator;

  @When("X plus y is calculated")
  public void add() {
    context.setResult(calculator.add(context.getX(), context.getY()));
  }

  @When("X minus y is calculated")
  public void subtract() {
    context.setResult(calculator.subtract(context.getX(), context.getY()));
  }
}
