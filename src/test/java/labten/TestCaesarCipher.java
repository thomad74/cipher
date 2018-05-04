package labten;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import labten.cipher.CaesarCipher;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class TestCaesarCipher {

  /** Create the object to be used in all of the test suites. */
  CaesarCipher caesarCipher = new CaesarCipher();

  /** The maximum number of items to use for testing. */
  private static int MAXIMUM_NUMBER_ITEMS = 100;

  /** The maximum number of items to use for testing. */
  private static int MAXIMUM_NUMBER_CHARS = 43;

  /** The size of the alphabet for character generation. */
  private static int ALPHABET_SIZE = 26;

  /** The starting character. */
  private static char STARTING_CHARACTER = 'a';

  /** A method to determine if an array is isSorted. */
  private boolean isSorted(char[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] > array[i + 1]) {
        return false;
      }
    }
    return true;
  }

  @Test
  public void testCaesarCipher() {
    assertEquals(caesarCipher.cipher("a"), "b");

  }
  // @Test
  // public void TestCaesarCipherB() {
  //   assertEquals(caesarCipher.cipher("b"), "c");
  // }
  // @Test
  // public void TestCaesarCipherC() {
  //   assertEquals(caesarCipher.cipher("c"), "d");
  // }

}
