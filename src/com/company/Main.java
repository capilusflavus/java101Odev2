package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Tutarı giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int tutar;
        double kdvTutarı;
        double sonuc;

        tutar= scanner.nextInt();
        if (0<tutar && 1000>tutar){
            kdvTutarı= ((tutar*18)/100);
            sonuc = kdvTutarı + tutar;
            System.out.println("Kdv Haric Tutarınız : "+ tutar);
            System.out.println("Kdv Tutarınız : "+ kdvTutarı);
            System.out.println("Toplam tutarınız : " + sonuc);
        }
        else if (tutar>1000) {
            kdvTutarı= ((tutar*8)/100);
            sonuc = kdvTutarı + tutar;
            System.out.println("Kdv Haric Tutarınız : "+ tutar);
            System.out.println("Kdv Tutarınız : "+ kdvTutarı);
            System.out.println("Toplam Tutarınız : "+ sonuc);
        }
    }
}
