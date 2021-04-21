package com.company;

import java.util.Scanner;

public class PetleCD {
    public static void main(String[] args) {

     for (int i = 1; i <=10; i++){

         for( int j = 1; j <=10; j++){

             System.out.print(i * j + " ");
         }
         if ( i % 2 != 0)
             continue;
         System.out.println();
     }

     for ( int k = 50; k >= 10; k--){
         System.out.println(k);
     }

        Scanner skanuj = new Scanner(System.in);
        System.out.println("wypisz liczbe");
        int r = skanuj.nextInt();
        int suma = 0;
        for( int u = 1; u <=r; u++)
            suma +=u;
            System.out.println("suma liczb to " +suma);

    }
}
