package com.company;

import java.util.Scanner;

public class OdczytujeNLiczyNKwadrat {
    public static void main(String[] args) {

        Scanner skanuj = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int b = skanuj.nextInt();
        int iloczyn = b * b;
        System.out.println(iloczyn);
    }
}
