package com.company;

import java.util.Random;
import java.util.Scanner;

public class LosowanieLotto {
    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("Twoje liczby to");
        for (int i = 1; i <= 6; i++){
            System.out.println(random.nextInt(46)+1);
        }



    }
}
