package j.algorithms;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class AlgorithmsApplicationTests {

    @Test
    void contextLoads() {
      final String contextLoaded = "hello-spring";
      assertThat(contextLoaded).isNotNull();
    }
}
