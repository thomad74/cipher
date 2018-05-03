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
    String[] source = new String[source];
    StringBuffer result = new StringBuffer();
    for (int i = 0; i < source.length(); i++) {
      if (Character.isUpperCase(source.charAt(i))) {
        char ch = (char)(((int)source.charAt(i) + shift - 65) % 26 + 65);
        result.append(ch);
      } else {
        char ch = (char)(((int)source.charAt(i) + shift - 97) % 26 + 97);
        result.append(ch);
      }
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
