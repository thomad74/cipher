package labten.cipher;

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
    System.arraycopy(source, ARRAY_START, sorted, ARRAY_START, source.length);
    for (int i = 0; i < length; i++){
      //TODO: finished algorithm for CaesarCipher


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
