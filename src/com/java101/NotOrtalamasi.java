package com.java101;

import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args) {

        int matematik,fizik,kimya,turkce,tarih,muzik;
        Scanner inp= new Scanner(System.in);

        System.out.println("Matematik notunuz:");
        matematik=inp.nextInt();

        System.out.println("Fizik notunuz:");
        fizik=inp.nextInt();

        System.out.println("Kimya notunuz:");
        kimya=inp.nextInt();

        System.out.println("Turkce notunuz:");
        turkce=inp.nextInt();

        System.out.println("Tarih notunuz:");
        tarih=inp.nextInt();

        System.out.println("Muzik notunuz:");
        muzik=inp.nextInt();

        int toplam=(matematik+fizik+kimya+turkce+tarih+muzik);
        double sonuc=(toplam/6);
        System.out.println("ders ortalamaniz:"+sonuc);

        System.out.println(sonuc>60? "gecti":"kaldi");
    }
}
