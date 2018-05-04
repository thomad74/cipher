package labten.cipher;

/**
 * An abstract class for all of the cipher implementations.
 *
 * @author Ben Watto and Dillon Thoma
 */

public abstract class Cipher {

  /** The name of the Cipher. */
  protected String name;

  /** The default name of the cipher. */
  private static final String DEFAULT_CIPHER = "default";

  /** Configure the name of the cipher. */
  public Cipher() {
    name = DEFAULT_CIPHER;
  }

  /** The name of the cipher. */
  public String getName() {
    return name;
  }

  /** Require that a Cipher provide a method for String arrays. */
  public abstract String cipher(String source);

}
