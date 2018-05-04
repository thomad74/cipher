package labten.cipher;

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

  /** Demonstrate the use of the Caesar algorithm. */
  public static void main(String[] args) {
    String[] letters = {"fortniterulez"};
    System.out.println("Before: " + java.util.Arrays.toString(letters));
    String[] sortedLetters = (new CaesarCipher()).cipher(letters);
    System.out.println("After : " + java.util.Arrays.toString(sortedLetters));
  }
}
