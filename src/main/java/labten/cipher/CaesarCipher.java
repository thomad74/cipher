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

  /** This final string ALPHABET contains all the options for CaesarCipher.
    * It is needed to allow the shift to move to the next letter. This provides
    * the output that is produced in the terminal window.
    */

  public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  /** This algorithm performs the CaesarCipher. It uses a shift of 1 to change
    * the position. It uses the index of each location to select the new positon.
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
