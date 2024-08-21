package org.example;

import java.util.Arrays;
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
    return Arrays.asList(commonPasswords).contains(password);
}
}