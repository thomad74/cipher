package labten.experiment;

import labten.computation.Cryptography;
import labten.data.ResultsTable;

/**
 * An experiment class that can run a campaign of experiments.
 * Note that this supports running campaigns of experiments for a
 * differnt number of rounds depending on the strategy.
 *
 * @author Jordan Wilson, Ben Watto, Robert Samuel, and Dillon Thoma
 */

public class Experiment {

  /** The campaign length for the Cryptography. */
  private static final int CRYPTOGRAPHY_CAMPAIGN_LENGTH = 6;

  /** Run the recursive experiment. */
  public static void runCryptographyExperiment() {
    RunCampaign runComputationCampaign = new RunCampaign();
    // Create a RecursiveFibonacciComputation and run it in a campaign
    CryptographyComputation cryptography = new CryptographyComputation();
    ResultsTable CryptographyResultsTable =
        runComputationCampaign.run(cryptography, CRYPTOGRAPHY_CAMPAIGN_LENGTH);
    System.out.println();
    System.out.println("Results of an experiment campaign with "
                       + Cryptography.getName() + ":\n");
    System.out.println(CryptographyResultsTable.toString());
    System.out.println();
  }

  /** Run the experiment campaigns for a different number of rounds. */
  public static void main(String[] args) {
    runCryptographyExperiment();
  }

}
