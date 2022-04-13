// Notortalamasi

/*
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
*/

//KdvTutari
 
 /*import java.util.Scanner;

public class KdvTutari {

    public static void main (String [] args) {

        Scanner inp=new Scanner(System.in);

        System.out.println("Kdvsiz fiyati giriniz:");

        double KdvsizFiyat,KdvOrani,KdvOrani_1=0.08,KdvOrani_2=0.18,KdvFarki,UrunFiyati;

        KdvsizFiyat=inp.nextDouble();

        double KdvliFiyat;

        KdvOrani=(KdvsizFiyat>1000? KdvOrani_1:KdvOrani_2);

        KdvFarki= KdvsizFiyat*KdvOrani;

        UrunFiyati=KdvFarki+KdvsizFiyat;

        System.out.println("Urunun kdvli fiyati:"+UrunFiyati);


    }
}

 */


 // Hipotenus
 /*
 import java.util.Scanner;

public class Hipotenus {

    public static void main (String[] args){

        Scanner inp=new Scanner(System.in);

        int BirinciDikKenar,IkinciDikKenar;
        double HipotenusunKaresi;

        System.out.print("Birinci dik kenari giriniz:");

        BirinciDikKenar= inp.nextInt();

        System.out.print("Ikinci dik kenari giriniz:");

        IkinciDikKenar=inp.nextInt();

        HipotenusunKaresi = ((BirinciDikKenar*BirinciDikKenar) + (IkinciDikKenar*IkinciDikKenar));

        System.out.print("Hipotenusun uzunlugu:"+Math.sqrt(HipotenusunKaresi));


    }
}
 */

//Taksimetre
 
 /*
 import java.util.Scanner;

public class Taksimetre {

    public static void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        double km,tutar,acilisUcreti=10,indibindi=20;
        System.out.print("Kac km gidildi?:");
        km = inp.nextDouble();
        tutar=((km*2.20)+acilisUcreti);
        System.out.println(tutar<20? indibindi:tutar);
        
    }
}

 */
 
 
 //DaireDilimiAlani
 
 /*
 import java.util.Scanner;

public class DaireAlaniVeCevresi {

    public static void main(String[] args){

        Scanner inp=new Scanner(System.in);

        double pi=3.14,DaireDilimialani,r,a;

        System.out.print("Daire yaricapini giriniz:");

        r=inp.nextDouble();

        System.out.print("Merkez acinin olcusunu giriniz:");

        a= inp.nextDouble();

        DaireDilimialani=((pi*(r*r)*a)/360);

        System.out.print("Daire Diliminin Alani:"+DaireDilimialani);

    }
}
*/


//Vücut Kitle indeksi

/*import java.util.Scanner;

public class Vucutkitle {

    public static void main (String[] args) {

        double boy,kilo,vucutkitleindeksi;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lutfen boyunuzu (metre cinsinde) giriniz:");

        boy=inp.nextDouble();

        System.out.println("Lutfen kilonuzu giriniz:");

        kilo=inp.nextDouble();

        vucutkitleindeksi=(kilo/(boy*boy));

        System.out.println("Vucut Kitle indeksiniz:"+vucutkitleindeksi);
    }

}
*/


// ManavKasaProgrami

/*
import java.util.Scanner;

public class Manav {

    public static void main(String[] args){

        Scanner inp=new Scanner(System.in);

        double Armut,Elma,Domates,Muz,Patlican,Tutar;

// Urunlerin kilo basi fiyatlari ==> Armut=2.14  Elma=3.67  Domates=1.11  Muz=0.95  Patlican=5.0

        System.out.println("Armut Kac Kilo ? :");
        Armut=inp.nextDouble();

        System.out.println("Elma Kac Kilo ? :");
        Elma=inp.nextDouble();

        System.out.println("Domates Kac Kilo ? :");
        Domates=inp.nextDouble();

        System.out.println("Muz Kac Kilo ? :");
        Muz= inp.nextDouble();

        System.out.println("Patlican Kac Kilo ? :");
        Patlican=inp.nextDouble();

        Tutar=(2.14*Armut)+(3.67*Elma)+(1.11*Domates)+(0.95*Muz)+(5.0*Patlican);

        System.out.println("Toplam Tutar:"+Tutar);
    }
}

*/
