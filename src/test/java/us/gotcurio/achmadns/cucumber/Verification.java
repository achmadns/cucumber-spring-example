package us.gotcurio.achmadns.cucumber;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java.en.Then;

public class Verification {
  @Autowired
  ScenarioContext context;

  @Then("The result is {int}")
  public void verify(int expected) {
    assertThat(context.getResult()).isEqualTo(expected);
  }

}
