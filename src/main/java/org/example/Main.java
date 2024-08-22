package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter password: ");
        String password = scanner.next();
        //System.out.println(password);
        //checking length
        System.out.println("Testing length: " + passwordLength(password));
        //checking digits
        System.out.println("Testing digits: " + containsDigits(password));
        //checking uppercase
        System.out.println("Testing uppercase: " + containsUpperCase(password));
        //checking lowercase
        System.out.println("Testing lowercase: " + containsLowerCase(password));
        //checking common passwords
        System.out.println("Testing for common passwords: " + commonPassword(password));
        //checking special characters
        System.out.println("Testing for special characters: " + specialCharacters(password));
        // Overall check
        //System.out.println(overallCheck(password));
        //Generate new password
        System.out.println("Generate new password. Enter number of digits (minimum 8): ");
        int lengthNewPassword = scanner.nextInt();
        System.out.println("New valid password: " + generatePassword(lengthNewPassword));



    }

    //Check length of password
    public static boolean passwordLength(String password) {
        return password.length() >= 8;
    }

    //Check digits
    public static boolean containsDigits(String password) {

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    //Check uppercase
    public static boolean containsUpperCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    //Check lowercase
    public static boolean containsLowerCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    //Check for common password
public static boolean commonPassword(String password) {
        String [] commonPasswords = {"123456789", "12345678", "hallo", "1234567890", "1234567", "password", "password1", "target123", "iloveyou", "gwekty123", "qwerty123", "qwertz", "qwertz123", "admin", "111111111"};
    return !Arrays.asList(commonPasswords).contains(password);
}

//Check for special characters
    public static boolean specialCharacters(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetter(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    //Overall Check
    public static boolean overallCheck(String password) {
        if (passwordLength(password) && containsDigits(password) && containsUpperCase(password) && containsLowerCase(password) && commonPassword(password) && specialCharacters(password)) {
            System.out.println("Your password is valid");
        }
        else System.out.println("Your password is not valid");

        return true;
    }

    //Generate random password
    public static String generatePassword(int lengthNewPassword) {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        char[] safePassword = new char[lengthNewPassword];

        safePassword[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        safePassword[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        safePassword[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        safePassword[3] = numbers.charAt(random.nextInt(numbers.length()));

        for(int i = 4; i< lengthNewPassword ; i++) {
            safePassword[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return new String(safePassword);
    }
}