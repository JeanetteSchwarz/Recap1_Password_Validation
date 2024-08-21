package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter password: ");
        String password = scanner.next();
        System.out.println(password);
        //checking length
        System.out.println("Testing length: " + passwordLength(password));
        //checking digits
        System.out.println("Testing digits: " + containsDigits(password));
        //checking uppercase
        System.out.println("Testing uppercase: " + containsUpperCase(password));
        //checking lowercase
        System.out.println("Testing lowercase: " + containsLowerCase(password));
    }

    //Check length of password
    private static boolean passwordLength(String password) {
        return password.length() >= 8;
    }

    //Check digits
    private static boolean containsDigits(String password) {

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    //Check uppercase
    private static boolean containsUpperCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    //Check lowercase
    private static boolean containsLowerCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}