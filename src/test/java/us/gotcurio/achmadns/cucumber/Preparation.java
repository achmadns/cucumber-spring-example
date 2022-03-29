package us.gotcurio.achmadns.cucumber;

import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Preparation {
  @Autowired
  ScenarioContext context;

  @Given("X is {int}")
  public void setX(int x) {
    context.setX(x);
  }

  @And("Y is {int}")
  public void setY(int y) {
    context.setY(y);
  }
}
