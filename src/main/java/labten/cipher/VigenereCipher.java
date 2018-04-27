package labten.cipher;

/**
 * An implementation of the Vigenere algorithm.
 *
 * @author
 */

public class VigenereCipher extends Cipher {

  /** Define the index at which an array starts. */
  private static int ARRAY_START = 0;

  /** Define the name of the algorithm. */
  public VigenereCipher() {
    name = "VigenereCipher";
  }


  /**
   * TODO:An implementation of the Vigenere algorithm.
   *
   *
   */

  public char[] cipher(char[] source) {

    return source;
  }

  /** Demonstrate the use of the BubbleSort algorithm. */
  public static void main(String[] args) {
    char[] letters = {'C', 'E', 'B', 'D', 'A', 'I', 'J', 'L', 'K', 'H', 'G', 'F'};
    System.out.println("Before: " + java.util.Arrays.toString(letters));
    char[] sortedLetters = (new VigenereCipher()).cipher(letters);
    System.out.println("After : " + java.util.Arrays.toString(sortedLetters));
  }
}
