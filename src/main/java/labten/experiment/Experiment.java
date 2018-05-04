package labten.experiment;

import labten.cipher.CaesarCipher;
import labten.cipher.Cipher;
import labten.cipher.VigenereCipher;
import labten.data.ResultsTable;

/**
 * An experiment class that can run a campaign of experiments.
 * Note that this supports running campaigns of experiments for a
 * different number of rounds depending on the strategy.
 *
 * @author Jordan Wilson, Ben Watto, Robert Samuel, and Dillon Thoma
 */

public class Experiment {

  /** Run the ciphering experiment. */
  /** Demonstrate the use of the Caesar algorithm. */
  public static void main(String[] args) {
    //System.out.println(cipher("abc", 1));
    String[] letters = {"fortniterulez"};
    System.out.println("Before: " + java.util.Arrays.toString(letters));
    String[] sortedLetters = (new CaesarCipher()).cipher(letters);
    System.out.println("After : " + java.util.Arrays.toString(sortedLetters));
    System.out.println();
    RunCampaign runCipherCampaign = new RunCampaign();

    // Create a Caesar cipher and run it in a campaign
    CaesarCipher caesarCipher = new CaesarCipher();
    ResultsTable caesarCipherResultsTable = runCipherCampaign.run(caesarCipher);
    System.out.println();
    System.out.println("Results of an experiment campaign with " + caesarCipher.getName() + ":\n");
    System.out.println(caesarCipherResultsTable.toString());
    System.out.println();

    // Create a Vigenere Cipher and run it in a campaign
    VigenereCipher vigenereCipher = new VigenereCipher();
    ResultsTable vigenereCipherResultsTable =
        runCipherCampaign.run(vigenereCipher);
    System.out.println();
    System.out.println("Results of an experiment campaign with "
        + vigenereCipher.getName() + ":\n");
    System.out.println(vigenereCipherResultsTable.toString());
    System.out.println();
  }
}
