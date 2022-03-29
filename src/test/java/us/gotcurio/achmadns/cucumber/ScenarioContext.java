package us.gotcurio.achmadns.cucumber;

import org.springframework.stereotype.Component;

import io.cucumber.spring.ScenarioScope;
import lombok.Data;

@Data
@Component
@ScenarioScope
public class ScenarioContext {
  private int x;
  private int y;
  private int result;
}
