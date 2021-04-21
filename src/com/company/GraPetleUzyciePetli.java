package com.company;

import java.util.Random;
import java.util.Scanner;

public class GraPetleUzyciePetli {
    public static void main(String[] args) {


        Scanner skanuj = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(15), b;

        do {
            System.out.println("Podaj liczbe");
            b = skanuj.nextInt();
            if( a < b){
                System.out.println("Podales za duza liczbe");
            }else if (a > b){
                System.out.println("Podales za mala liczbe");
            }
        } while (b != a);
            System.out.println("gratulacje ");

    }
}
