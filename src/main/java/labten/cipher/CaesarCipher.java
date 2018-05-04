package labten.cipher;

import labten.experiment.Experiment;
import java.util.Arrays;

/**
 * An implementation of the Caesar algorithm.
 *
 * @author
 */

public class CaesarCipher extends Cipher {

  /** Define the index at which an array starts. */
  private static int ARRAY_START = 0;

  /** Define the name of this algorithm. */
  public CaesarCipher() {
    name = "CaesarCipher";
  }

  /**
   * TODO:An implementation of the Caesar algorithm.
   *
   *
   */




  // String msg = "hello";
  // char shift = 3;
  //
  // String cipher(String msg, int shift) {
  //   String size = "";
  //   int len = msg.length();
  //   for (int x = 0; x < len; x++) {
  //
  //     char start = (char)(msg.charAt(x) + shift);
  //     if (start > 'z') {
  //
  //       size += (char)(msg.charAt(x) - (26 - shift));
  //     } else {
  //       size += (char)(msg.charAt(x) + shift);
  //     }
  //   }
  //   return size;
  //
  //
  // }

  /**
    * TODO:An implementation of the Caesar algorithm.
    *
    *
    */

  public String[] cipher(String[] source) {
    int length = source.length;
    String[] sorted = new String[source.length];

    int key = 1;
    // Makes a copy of the source array list
    System.arraycopy(source, ARRAY_START, sorted, ARRAY_START, source.length);
    // iterates through the sorted array list and changes all the characters to upper case
    for (int i = 0; i < sorted.length; i++) {

    }
    return source;
  }
}
