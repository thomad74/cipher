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

  public String[] cipher(String[] source) {
    int length = source.length;
    char[] sorted = new char[source.length];
    System.arraycopy(source, ARRAY_START, sorted, ARRAY_START, source.length);


    return source;
  }

  /** Demonstrate the use of the BubbleSort algorithm. */
  public static void main(String[] args) {
    String[] letters = {"fortnitesux"};
    System.out.println("Before: " + java.util.Arrays.toString(letters));
    String[] sortedLetters = (new VigenereCipher()).cipher(letters);
    System.out.println("After : " + java.util.Arrays.toString(sortedLetters));
  }
}
