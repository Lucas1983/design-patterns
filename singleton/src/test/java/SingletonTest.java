import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Objects;
import org.junit.jupiter.api.Test;

public class SingletonTest {

  @Test
  public void testInstance() {

    Singleton singleton = Singleton.getInstance();
    assertTrue(Objects.nonNull(singleton));
  }
}
