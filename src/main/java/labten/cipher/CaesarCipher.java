package labten.cipher;

/**
 * An implementation of the Caesar algorithm.
 *
 * @author
 */

public class CaesarCipher extends Cipher {

  /** Define the name of this algorithm. */
  public CaesarCipher() {
    name = "CaesarCipher";
  }

  /**
   * TODO:An implementation of the Caesar algorithm.
   *
   *
   */
  public String[] cipher(String[] source, int shift) {
    StringBuffer result = new StringBuffer();
    for (int i = 0; i < source.length(); i++) {
      if (Character.isUpperCase(source.charAt(i))) {
      }
    }
    return source;
  }

  /** Demonstrate the use of the Caesar algorithm. */
  public static void main(String[] args) {
    String[] letters = {"fortnite rulez"};
    System.out.println("Before: " + java.util.Arrays.toString(letters));
    String[] sortedLetters = (new CaesarCipher()).cipher(letters);
    System.out.println("After : " + java.util.Arrays.toString(sortedLetters));
  }
}
