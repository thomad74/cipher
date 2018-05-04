package labten;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import labten.cipher.VigenereCipher;
import org.junit.Test;

import java.util.Random;

/**
 * A JUnit test suite for the VigenereCipher.
 *
 * @author
 */

public class TestVigenereCipher {

  /** Create the object to be used in all of the test suites. */
  VigenereCipher vigenereCipher = new VigenereCipher();

  /** The maximum number of items to use for testing. */
  private static int MAXIMUM_NUMBER_ITEMS = 100;

  /** The maximum number of items to use for testing. */
  private static int MAXIMUM_NUMBER_CHARS = 43;

  /** The size of the alphabet for character generation. */
  private static int ALPHABET_SIZE = 26;

  /** The starting character. */
  private static char STARTING_CHARACTER = 'a';
  
  @Test
  public void TestVigenereCipherA() {
    assertEquals(vigenereCipher.cipher("a"), "b");
  }
  @Test
  public void TestVigenereCipherB() {
    assertEquals(vigenereCipher.cipher("b"), "c");
  }
}
