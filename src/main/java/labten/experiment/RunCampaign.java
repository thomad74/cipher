package labten.experiment;

import labten.cipher.Cipher;
import labten.data.ResultsTable;

import java.util.Random;

/**
  * A RunCampaign that can run an experiment with a computer.
  *
  * @author Dillon Thoma, Ben Watto, Jordan Wilson, Robert Samuel
  */

public class RunCampaign implements Campaign {

  /** The starting size for running an experiment campaign. */
  private static final int INPUT_SIZE_START = 1;

  /** The growth factor for input when running an experiment campaign. */
  private static final int INPUT_GROWTH_FACTOR = 2;

  /** The total number of input size doubles to perform for an experiment campaign. */
  private static final int CAMPAIGN_LENGTH = 10;

  /** The indentation level for the output. */
  private static final String IDENTATION = "  ";

  static final String Inputs = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  /** Randomly generate data to use for an experiment. */
  public String generateRandomData(int size) {
    StringBuilder sb = new StringBuilder(size);
    Random random = new Random();
    for (int i = 0; i < size; i++) {
      sb.append(Inputs.charAt(random.nextInt(Inputs.length())));
    }
    return sb.toString();
  }

  /** Run the cipher in an experiment campaign. */
  public ResultsTable run(Cipher cipher) {
    int campaignRound = 0;
    int currentInputSize = INPUT_SIZE_START;
    ResultsTable results = new ResultsTable(CAMPAIGN_LENGTH);
    System.out.println("Starting a campaign of experiments with " + cipher.getName() + " ...");
    while (campaignRound < CAMPAIGN_LENGTH) {
      long timeBefore = System.currentTimeMillis();
      cipher.cipher(Inputs);
      long timeAfter = System.currentTimeMillis();
      long timeElapsed = timeAfter - timeBefore;
      results.addResult((long)currentInputSize, timeElapsed);
      System.out.println(IDENTATION + "Running round " + campaignRound
          + " with input size " + currentInputSize);
      currentInputSize = currentInputSize * INPUT_GROWTH_FACTOR;
      campaignRound++;
    }
    System.out.println("... Finishing a campaign of experiments with " + cipher.getName());
    return results;
  }

}
