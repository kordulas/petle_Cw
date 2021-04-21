package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        for(int i = 5; i <=10; i++)
        {
            System.out.println(i);
        }


        for (int b = 1; b<=5 ; b++){
            System.out.println("hello world");
        }

        for (int c = 5; c <=50; c++){

            if ( c % 2 == 0)
                continue;
            System.out.println(c);
        }

        int f = 10;
        while (f <=100){
            System.out.println(f);
            f +=10;
        }
    }
    }

