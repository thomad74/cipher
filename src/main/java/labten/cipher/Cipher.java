package labten.cipher;

/**
 * An abstract class for all of the sorting implementations.
 *
 * @author
 */

public abstract class Cipher {

  /** The name of the Cipher. */
  protected String name;

  /** The default name of the sorter. */
  private static final String DEFAULT_CIPHER = "default";

  /** Configure the name of the sorter. */
  public Cipher() {
    name = DEFAULT_CIPHER;
  }

  /** The name of the sorter. */
  public String getName() {
    return name;
  }

  /** Require that a Sorter provide a method for char[] arrays. */
  public abstract String[] cipher(String[] source);

}
