package com.company;

import java.util.Scanner;

public class PodaniePoprawnegoHaslaPetla {
    public static void main(String[] args) {

        Scanner skanuj = new Scanner(System.in);
        String password;

        do {
            System.out.println("Podaj haslo");
            password = skanuj.nextLine();
        } while (!password.equals("Polska"));
        System.out.println("podales prawidlowe haslo");
    }
}