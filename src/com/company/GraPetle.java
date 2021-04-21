package com.company;

import javax.print.attribute.standard.PagesPerMinute;
import java.util.Scanner;

public class GraPetle {
    public static void main(String[] args) {

        Scanner skanuj = new Scanner(System.in);
        System.out.println("Wprowadz liczbe");
        int liczba = skanuj.nextInt();
        int a = 600;
        if ( liczba == 600){
            System.out.println("Gratulacje");
        }else if (liczba > 600){
            System.out.println("liczba jest za duza");
        }else{
            System.out.println("liczba zbyt mala");
        }
    }
}
