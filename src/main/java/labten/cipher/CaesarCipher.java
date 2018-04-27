package labfive.sort;

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
   * An implementation of the Caesar algorithm.
   *
   *
   */
  public char[] cipher(char[] source) {
    int length = source.length;
    char[] sorted = new char[source.length];
    System.arraycopy(source, 0, sorted, 0, source.length);
    for (int i = 1; i < length; i++) {
      char currentValue = sorted[i];
      int start = i;
      while (start > 0 && sorted[start - 1] > currentValue) {
        sorted[start] = sorted[start - 1];
        start--;
      }
      sorted[start] = currentValue;
    }
    return sorted;
  }

  /** Demonstrate the use of the Caesar algorithm. */
  public static void main(String[] args) {
    char[] letters = {'C', 'E', 'B', 'D', 'A', 'I', 'J', 'L', 'K', 'H', 'G', 'F'};
    System.out.println("Before: " + java.util.Arrays.toString(letters));
    char[] sortedLetters = (new CaesarCipher()).cipher(letters);
    System.out.println("After : " + java.util.Arrays.toString(sortedLetters));
  }
}
