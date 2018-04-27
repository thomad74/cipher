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

  /** Run Cryptography in an experiment campaign. */
  public static void main(String[] args) {
    RunCampaign runCampaign = new RunCampaign();
    Cryptography cryptography = new Cryptography();
    ResultsTable resultsTable = runCampaign.run();
    System.out.println();
    System.out.println("Results of an experiment campaign: \n");
    System.out.println(resultsTable.toString());
    System.out.println();

}
