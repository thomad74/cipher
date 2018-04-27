package labten.computation;

import labten.data.ResultsTable;

import java.util.Date;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author Dillon Thoma, Ben Watto, Jordan Wilson, Robert Samuel
 */

public class Cryptography {


  public static String encrypt(String text, final String key) {
        String res = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z'){
                continue;
            }
            res += (char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
            j = ++j % key.length();
        }
        return res;
  }

  public static String decrypt(String text, final String key) {
        String res = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z') {
                continue;
            }
            res += (char) ((c - key.charAt(j) + 26) % 26 + 'A');
            j = ++j % key.length();
        }
        return res;
    }

  public static void main(String[] args) {
        String key = "VIGENERECIPHER";
        String message = "testing if it is correct";
        String encryptedMsg = encrypt(message, key);
        System.out.println("String: " + message);
        System.out.println("Encrypted message: " + encryptedMsg);
        System.out.println("Decrypted message: " + decrypt(encryptedMsg, key));
  }

}
