package com.company;

import java.util.Scanner;

public class Silnia {
    public static void main(String[] args) {
        Scanner skanuj = new Scanner(System.in);
        System.out.println("Podaj liczbe n :");
        int nSilnia = 1, n;
        n = skanuj.nextInt();
        for (int i = 1; i <=n; i++)
        nSilnia = nSilnia * i;
        System.out.println("Silnia liczby :" + n + " " + "wynosi :" +nSilnia);
    }
}
