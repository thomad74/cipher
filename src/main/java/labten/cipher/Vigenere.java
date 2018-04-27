package labten.cipher;

/**
 * An implementation of the Vigenere algorithm.
 *
 * @author
 */

public class Vigenere extends Cipher {

  /** Define the index at which an array starts. */
  private static int ARRAY_START = 0;

  /** Define the name of the algorithm. */
  public Vigenere() {
    name = "Cipher";
  }


  /**
   * An implementation of the Vigenere algorithm.
   *
   *
   */
   
  public char[] sort(char[] source) {
    int length = source.length;
    char[] sorted = new char[source.length];
    System.arraycopy(source, ARRAY_START, sorted, ARRAY_START, source.length);
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < (length - 1); j++) {
        if (sorted[j] > sorted[j + 1]) {
          char temporary = sorted[j];
          sorted[j] = sorted[j + 1];
          sorted[j + 1] = temporary;
        }
      }
    }
    return sorted;
  }

  /** Demonstrate the use of the BubbleSort algorithm. */
  public static void main(String[] args) {
    char[] letters = {'C', 'E', 'B', 'D', 'A', 'I', 'J', 'L', 'K', 'H', 'G', 'F'};
    System.out.println("Before: " + java.util.Arrays.toString(letters));
    char[] sortedLetters = (new Vigenere()).cipher(letters);
    System.out.println("After : " + java.util.Arrays.toString(sortedLetters));
  }
}
