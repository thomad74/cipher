package labten.cipher;

import labten.experiment.Experiment;

import java.util.Arrays;

/**
 * An implementation of the Caesar algorithm.
 *
 * @author Dillon Thoma, Ben Watto
 */

public class CaesarCipher extends Cipher {

  /** Define the index at which an array starts. */
  private static int ARRAY_START = 0;

  /** Define the name of this algorithm. */
  public CaesarCipher() {
    name = "CaesarCipher";
  }

  /**
    * JavaDoc Comment.
    */
    
  public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

  /**
    * JavaDoc Comment.
    */

  public String cipher(String source) {
    int shiftKey = 1;
    source = source.toLowerCase();
    String cipherText = "";
    for (int i = 0; i < source.length(); i++) {
      int charPosition = ALPHABET.indexOf(source.charAt(i));
      int keyVal = (shiftKey + charPosition) % 26;
      char replaceVal = ALPHABET.charAt(keyVal);
      cipherText += replaceVal;
    }
    return cipherText;
  }
}
