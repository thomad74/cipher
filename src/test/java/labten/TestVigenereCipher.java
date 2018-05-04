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
 * @author Ben Watto and Dillon Thoma
 */

public class TestVigenereCipher {

  /** Create the object to be used in all of the test suites. */
  VigenereCipher vigenereCipher = new VigenereCipher();

  @Test
  public void testVigenereCipherA() {
    assertEquals(vigenereCipher.cipher("a"), "L");
  }

  @Test
  public void testVigenereCipherB() {
    assertEquals(vigenereCipher.cipher("b"), "M");
  }

  @Test
  public void testVigenereCipherC() {
    assertEquals(vigenereCipher.cipher("c"), "N");
  }
}
