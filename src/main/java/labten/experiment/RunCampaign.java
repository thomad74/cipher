package labten.experiment;

import labten.computation.Cryptography;
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

  static final String ValidInputs = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

}
