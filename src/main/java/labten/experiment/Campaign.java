package labten.experiment;

import labten.cipher.Cipher;
import labten.data.ResultsTable;

/**
 * A Campaign interface used to run an experiment.
 *
 * @author Dillon Thoma, Ben Watto, Jordan Wilson, Robert Samuel
 */

public interface Campaign {

  /** Require that any Campaign implementer can run a Cipher in an experiment. */
  public ResultsTable run(Cipher cipher);

}
