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
    private static final int INPUT_SIZE_START = 250;

    /** The growth factor for input when running an experiment campaign. */
    private static final int INPUT_GROWTH_FACTOR = 2;

    /** The total number of input size doubles to perform for an experiment campaign. */
    private static final int CAMPAIGN_LENGTH = 10;

    /** The indentation level for the output. */
    private static final String IDENTATION = "  ";

    /** Randomly generate data to use for an experiment. */
    public int[] generateRandomData(int size) {
      Random random = new Random();
      int[] generated = new int[size];
      //TODO: use a stringbuilder to create an array of char/strings
      for (int i = 0; i < size; i++) {
        size = (random.nextInt());
      }
      return generated;
    }

    /** Run the cipher in an experiment campaign. */
    public ResultsTable run(Cipher cipher) {
      int campaignRound = 0;
      int currentInputSize = INPUT_SIZE_START;
      ResultsTable results = new ResultsTable(CAMPAIGN_LENGTH);
      System.out.println("Starting a campaign of experiments with " + cipher.getName() + " ...");
      while (campaignRound < CAMPAIGN_LENGTH) {
        int[] arraySize = generateRandomData(currentInputSize);
        long timeBefore = System.currentTimeMillis();
        cipher.cipher(arraySize);
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
