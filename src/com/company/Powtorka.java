package com.company;

import java.util.Random;
import java.util.Scanner;

public class Powtorka {
    public static void main(String[] args) {

        System.out.println("twoje liczby to");
            Random random = new Random();

            for (int i = 1; i<=6; i++) {
                System.out.println(random.nextInt(46) + 1);
            }


        Scanner skanuj = new Scanner(System.in);
        Random random2 = new Random();
        int a = random2.nextInt(30);
        int b;
        int i = 0;
            do{
                i++;
                System.out.println("Wprowadz liczbe");
                b = skanuj.nextInt();
                if (a < b){
                    System.out.println("wprowadzona liczba jest za duza");
                }else if ( a > b){
                    System.out.println("wprowadzona liczba jest za mala");
                }
            }while (a !=b);
        System.out.println("Gratulacje, odgadłeś za " + i + " razem");
}
}

