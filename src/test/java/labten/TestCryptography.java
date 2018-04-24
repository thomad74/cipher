package labten;

// import org.junit.Assert.assertArrayEquals;
// import org.junit.Assert.assertEquals;
// import org.junit.Assert.assertTrue;

import labten.Cryptography;
// import org.junit.test;

public class TestCryptography {

@Test
  public void cipherCanEncode() {
    String message = encryptedMsg.getKey().substring(0, 10);
    assertEquals(message, encryptedMsg.encode("aaaaaaaaaa"));
  }
}
