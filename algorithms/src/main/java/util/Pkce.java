package util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Arrays;
import java.util.Base64;

/**
 * PKCE is used by Oauth 2.0 on devices that cannot guarantee the
 * confidentiality of a user's secret token.
 */
public class Pkce {

  static String generatePkceCodeVerifier() {
    SecureRandom rand = new SecureRandom();
    byte[] verifier = new byte[32];
    rand.nextBytes(verifier);
    return Base64.getUrlEncoder().withoutPadding().encodeToString(verifier);
  }

  static String generatePkceCodeCallenge(String codeVerifier) throws NoSuchAlgorithmException {
    byte[] bytes = codeVerifier.getBytes(StandardCharsets.US_ASCII);

    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
    messageDigest.update(bytes, 0, bytes.length);
    byte[] digest = messageDigest.digest();
    return Base64.getUrlEncoder().withoutPadding().encodeToString(digest);
  }

  /**
   * Example use of CodeVerifier and CodeChallenge generator functions,
   * for use with the PKCE Oauth 2.0 authentication flow.
   */
  public static void main() {
    System.out.println(Arrays.toString(Security.getProviders()));
    String codeVerifier = generatePkceCodeVerifier();
    try {
      String codeChallenge = generatePkceCodeCallenge(codeVerifier);

      System.out.println("codeVerifier = " + codeVerifier);
      System.out.println("codeChallenge = " + codeChallenge);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
