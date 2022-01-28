package com.company;

public class Main {

    public static void main(String[] args) {
        EmailPattern emailPattern = new EmailPattern();

        String email1 = "hoale@gmail.com";
        String email2 = "ho1le@gmail.com";
        String email3 = "hoale.gmail.com";

        System.out.println("Email " + email1 + " is valid: " + emailPattern.validate(email1));
        System.out.println("Email " + email2 + " is valid: " + emailPattern.validate(email2));
        System.out.println("Email " + email3 + " is valid: " + emailPattern.validate(email3));
    }
}
