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
    String letters = "bosco likes to eat food from alex";
    System.out.println("Before: " + letters);
    String sortedLetters = (new CaesarCipher()).cipher(letters);
    System.out.println("After : " + sortedLetters);
    System.out.println();
    /** Demonstrate the use of the Vigenere algorithm. */
    String moreLetters = "abcdefghijklmnopqrstuvwxyz";
    System.out.println("Before: " + moreLetters);
    String moreSortedLetters = (new VigenereCipher()).cipher(moreLetters);
    System.out.println("After : " + moreSortedLetters);
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
