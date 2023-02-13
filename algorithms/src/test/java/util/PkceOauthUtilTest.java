package util;

import org.junit.jupiter.api.Test;
import java.security.Security;
import java.util.Arrays;
import static org.assertj.core.api.Assertions.assertThat;
import static util.Pkce.generatePkceCodeCallenge;
import static util.Pkce.generatePkceCodeVerifier;

/**
 * pkceOauthUtilTest.
 */
class PkceOauthUtilTest {

  @Test
  void generatePkceCodeVerifierTest() {
    System.out.println(Arrays.toString(Security.getProviders()));
    String codeVerifier = generatePkceCodeVerifier();
    assertThat(codeVerifier.length()).isGreaterThan(30);
  }

  @Test
  void generatePkceCodeCallengeTest() {
    String codeVerifier = generatePkceCodeVerifier();
    try {
      String codeChallenge = generatePkceCodeCallenge(codeVerifier);

      System.out.println("codeVerifier = " + codeVerifier);
      System.out.println("codeChallenge = " + codeChallenge);

      assertThat(codeChallenge).isNotEqualTo(codeVerifier);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}