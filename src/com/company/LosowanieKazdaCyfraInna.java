package com.company;

import java.util.Arrays;
import java.util.Random;

public class LosowanieKazdaCyfraInna {
    public static void main(String[] args) {

        Random random = new Random();
        int [] wyniki = new int[6];

        for (int i = 0; i <6; i++){

            int randomValue = random.nextInt(46)+1;

            while (Arrays.asList(wyniki).contains(randomValue))
            randomValue = random.nextInt(46) +1;
            wyniki[i] = randomValue;



        }
        for (int i = 0; i <6; i++){
    System.out.println("Liczba to :" + wyniki[i]);
        }
}
}
