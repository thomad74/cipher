package labten.experiment;

import labten.data.ResultsTable;
import labten.cipher.Cipher;

/**
 * A Campaign interface used to run an experiment.
 *
 * @author Dillon Thoma, Ben Watto, Jordan Wilson, Robert Samuel
 */

public interface Campaign {

  /**
   *
   */
  public ResultsTable run(Cipher cipher);

}
