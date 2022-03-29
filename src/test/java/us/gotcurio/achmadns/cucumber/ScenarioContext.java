package us.gotcurio.achmadns.cucumber;

import org.springframework.stereotype.Component;

import io.cucumber.spring.ScenarioScope;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@ScenarioScope
public class ScenarioContext {
  private int x;
  private int y;
  private int result;
}
