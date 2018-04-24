package labten.experiment;

import labten.data.ResultsTable;
import labten.computation.Cryptography;

/**
 * A Campaign interface used to run an experiment.
 *
 * @author
 */

public interface Campaign {

  /**
   *
   */
  public ResultsTable run(Cryptography computation, int campaignLength);

}
