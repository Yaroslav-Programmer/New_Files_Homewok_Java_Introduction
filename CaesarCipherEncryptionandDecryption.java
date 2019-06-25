package com.company;
import java.lang.String;
import java.util.Scanner;

public class CaesarCipherEncryptionandDecryption {
    private static final int SHIFT = 3;
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        caesarCipher();
        caesarDecryptor();
    }

    private static void caesarCipher() {
        System.out.println("Input your unencrypted text: ");
        String unencrypted_text = scanner.nextLine();
        String encrypted_text = "";
        char alphabet;
        for (int i = 0; i < unencrypted_text.length(); i++) {
            alphabet = unencrypted_text.charAt(i);

            if (alphabet >= 'a' && alphabet <= 'z') {
                alphabet = (char) (alphabet + SHIFT);
                if (alphabet > 'z') {
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                encrypted_text += alphabet;
            } else if (alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + SHIFT);

                if (alphabet > 'Z') {
                    alphabet = (char) (alphabet + 'A' - 'Z' - 1);
                }
                encrypted_text += alphabet;
            } else {
                encrypted_text += alphabet;
            }
        }
        System.out.println("Cipher text: " + encrypted_text);
    }

    private static void caesarDecryptor() {
        System.out.println("Input your cipher text: ");
        String unencrypted_text = scanner.nextLine();
        String decryptMessage = "";
        for (int i = 0; i < unencrypted_text.length(); i++) {

            char alphabet = unencrypted_text.charAt(i);

            if (alphabet >= 'a' && alphabet <= 'z') {

                alphabet = (char) (alphabet - SHIFT);

                if (alphabet < 'a') {

                    alphabet = (char) (alphabet - 'a' + 'z' + 1);
                }
                decryptMessage += alphabet;
            } else if (alphabet >= 'A' && alphabet <= 'Z') {

                alphabet = (char) (alphabet - SHIFT);

                if (alphabet < 'A') {

                    alphabet = (char) (alphabet - 'A' + 'Z' + 1);
                }
                decryptMessage += alphabet;
            } else {
                decryptMessage += alphabet;
            }
        }
        System.out.println("Decrypted text : " + decryptMessage);
    }
}