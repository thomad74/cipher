package labten.cipher;

import java.util.Arrays;


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




   String msg = "hello";
   char shift = 3;

   String cipher(String msg, int shift){
     String s = "";
     int len = msg.length();
     for(int x = 0; x < len; x++){
         char c = (char)(msg.charAt(x) + shift);
         if (c > 'z')
             s += (char)(msg.charAt(x) - (26-shift));
         else
             s += (char)(msg.charAt(x) + shift);
     }
     return s;


 }public String[] cipher(String[] source) {
    int length = source.length;
    String[] sorted = new String[source.length];

    int key = 1;
    // Makes a copy of the source array list
    System.arraycopy(source, ARRAY_START, sorted, ARRAY_START, source.length);
    // iterates through the sorted array list and changes all the characters to upper case
    for (int i = 0; i < sorted.length; i++) {
<<<<<<< HEAD
      //sorted[i] = sorted[i].toUpperCase();
    //}

    //char[] plainTextChar = sorted.toCharArray();
    //String[] test = new String[Arrays.toString(sorted)];
    //String test = Arrays.toString(sorted);
    //char[] plainTextChar = test.toCharArray();


    //for (int i = 0; i < length; i++) {

      //plainTextChar[i] = (char)(((int)plainTextChar[i] + key - 65) % 26 + 65);
      //System.out.println(String.valueOf(plainTextChar));







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
=======
>>>>>>> 7da8502df7e76f45eebbd869b675f5ea5abf312f


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
