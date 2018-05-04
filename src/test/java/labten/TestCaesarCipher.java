package labten;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import labten.cipher.CaesarCipher;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * A JUnit test suite for the CaesarCipher.
 *
 * @author Ben Watto and Dillon Thoma
 */
public class TestCaesarCipher {

  /** Create the object to be used in all of the test suites. */
  CaesarCipher caesarCipher = new CaesarCipher();

  @Test
  public void testCaesarCipherA() {
    assertEquals(caesarCipher.cipher("a"), "b");
  }

  @Test
  public void testCaesarCipherB() {
    assertEquals(caesarCipher.cipher("b"), "c");
  }

  @Test
  public void testCaesarCipherC() {
    assertEquals(caesarCipher.cipher("c"), "d");
  }
}
