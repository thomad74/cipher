package labten.cipher;

import java.io.*;
import java.util.*;


/**
 * An implementation of the Caesar algorithm.
 *
 * @author
 */

public class CaesarCipher extends Cipher {

  /** Define the index at which an array starts. */
  private static int ARRAY_START = 0;

  /** Define the name of this algorithm. */
  public CaesarCipher() {
    name = "CaesarCipher";
  }

  /**
   * TODO:An implementation of the Caesar algorithm.
   *
   *
   */
  public String[] cipher(String[] source) {
    int length = source.length;
    String[] sorted = new String[source.length];

    int key = 1;

    System.arraycopy(source, ARRAY_START, sorted, ARRAY_START, source.length);
        for (int i = 0; i < sorted.length; i++){
          sorted[i] = sorted[i].toUpperCase();
        }
          //char[] plainTextChar = sorted.toCharArray();
          String test = Arrays.toString(sorted);
          char[] plainTextChar = test.toCharArray();


    for (int i = 0; i < length; i++){

      plainTextChar[i] = (char)(((int)plainTextChar[i] + key - 65) % 26 + 65);
      System.out.println(String.valueOf(plainTextChar));







      //TODO: finished algorithm for CaesarCipher
      //int currentLetter = sorted[i];
      //int start = i;

      // StringBuffer result = new StringBuffer();
      // if (Character.isUpperCase(sorted.charAt(i))){
      //   char ch = (char)(((int)sorted.charAt(i) + shift - 65) % 26 + 65);
      //   result.append(ch);
      // } else {
      //   char ch = (char)(((int)sorted.charAt(i) + shift - 97) % 26 + 97);
      //   result.append(ch);
      // }

      //sorted = sorted.toUpperCase();

    }
    return source;
  }

  /** Demonstrate the use of the Caesar algorithm. */
  public static void main(String[] args) {
    String[] letters = {"fortniterulez"};
    System.out.println("Before: " + java.util.Arrays.toString(letters));
    String[] sortedLetters = (new CaesarCipher()).cipher(letters);
    System.out.println("After : " + java.util.Arrays.toString(sortedLetters));
  }
}
