package labten.cipher;

/**
 * An implementation of the Vigenere algorithm.
 *
 * @author Dillon Thoma and Ben Watto
 */

public class VigenereCipher extends Cipher {

  /** Define the index at which an array starts. */
  private static int ARRAY_START = 0;

  /** Define the name of the algorithm. */
  public VigenereCipher() {
    name = "VigenereCipher";
  }

  /**
    * JavaDoc Comment.
    */

  public String cipher(String source) {
    String key = "fortnite";
    String res = "";
    source = source.toUpperCase();
    for (int i = 0, j = 0; i < source.length(); i++) {
      char index = source.charAt(i);
      if (index < 'A' || index > 'Z') {
        continue;
      }
      res += (char) ((index + key.charAt(j) - 2 * 'A') % 26 + 'A');
      j = j++ % key.length();
    }
    return res;
  }
}
