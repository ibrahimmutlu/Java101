// NOT ORTALAMASI

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


//KDV TUTARI
 
import java.util.Scanner;

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

 


 // HİPOTENUS
 
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
 

//TAKSİMETRE
 
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

 
 
 
 //DAİRE DİLİMİ ALANİ
 

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



//VÜCUT KİTLE İNDEKSİ

import java.util.Scanner;

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


// MANAV KASA PROGRAMI

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



// HESAP MAKİNESİ
import java.util.Scanner;

public class Hesapmakinesi {

    public static void main(String[]args){

        Scanner inp=new Scanner(System.in);

        int n1,n2,select;

        System.out.println("ilk sayiyi giriniz:");

        n1=inp.nextInt();

        System.out.println("ikinci sayiyi giriniz:");

        n2=inp.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");

        System.out.println("Lutfen seciminizi yapiniz:");

        select=inp.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam:"+(n1+n2));
                break;
            case 2:
                System.out.println("Cikarma:"+(n1-n2));
                break;
            case 3:
                System.out.println("Carpma:"+(n1*n2));
                break;
            case 4:
                if(n2==0){
                    System.out.println("bir sayi sifira bolunmez.");
                }
                System.out.println("Bolme:" +(n1/n2));
                break;
            default:
                System.out.println("Hatali giris yaptiniz. Tekrar deneyiniz:");
        }

    }
}



// KULLANICI GİRİŞİ

import java.util.Scanner;

public class Kullanicigirisi {

    public static void main(String[] args){

        String username="patika",password="123",newUsername="JAVA",newPassword="456";
        int select;

        Scanner input= new Scanner(System.in);

        System.out.println("Kullanici adiniz:");

        username=input.nextLine();

        System.out.println("Sifreniz:");

        password=input.nextLine();

        if(username.equals("patika")&&password.equals("123")) {
            
            System.out.println("Giris Basarili!");

        } else if(!"patika".equals(username) || !"123".equals(password)) {
            System.out.println("Bilgiler eksik ya da hatalidir.Sifrenizi sifirlamak ister misiniz ?");
            
            System.out.println("1-Evet istiyorum\n2-Hayir tekrar denemek istiyorum");
            
            select=input.nextInt();
            
          switch (select) {
              case 1:
                  System.out.println("Yeni gireceginiz sifre eski sifreniz ile ayni olmamalidir.");
                  
                  System.out.println("Yeni kullanici adiniz:");
                  
                  Scanner inp= new Scanner(System.in);
                  
                  newUsername=inp.nextLine();

                  System.out.println("Yeni sifreniz:");

                  newPassword=inp.nextLine();

                   if(newUsername.equals("JAVA")&&newPassword.equals("456")) {
                       
                       System.out.println("Sifre olusturuldu. Giris Basarili");

                  }
                      else {
                       System.out.println("Sifre olusturulamadi.LUtfen baska sifre giriniz.");
                      }
              break;

              case 2:
                  System.out.println("Yeniden giris yapiniz.");

                  System.out.println("Kullanici adiniz:");
                  
                  Scanner in= new Scanner(System.in);
                  
                  username=in.nextLine();

                  System.out.println("Sifreniz:");

                  password=in.nextLine();


                   if(username.equals("patika")&&password.equals("123")) {
                       
                      System.out.println("Giris Basarili!");
                  }
                  break;

          }
        }
        }

     }

//SINIFI GEÇME DURUMU

import java.util.Scanner;

public class Sinifigecmedurumu {

    public static void main(String[]args){

        Scanner input=new Scanner(System.in);

        int matematik,fizik,turkce,kimya,muzik;

        System.out.print("Matematik notunuz:");
        matematik= input.nextInt();

        System.out.print("Fizik notunuz:");
        fizik= input.nextInt();

        System.out.print("Turkce notunuz:");
        turkce= input.nextInt();

        System.out.print("Kimya notunuz:");
        kimya= input.nextInt();

        System.out.print("Muzik notunuz:");
        muzik= input.nextInt();

        double average=(matematik+fizik+turkce+kimya+muzik)/5;

        /*DİPNOT*/
        //Ders notu 0 veya 100 arasında değilse ortalamaya katılmamıştır.Fakat bu kodun eksiği vardır.
        // Birden çok ders 0 veya 100 arasında değilse program düzgün çalışmamaktadır.
        // Bunu ise yine if ile farklı kombinasyonlarda yazabiliriz.Kodun uzamaması için yazılmamıştır.
        //Ayrıca ortalama bulunurken 0 veya 100 arasında olmayan dersin sayılıp sayılmaması gerektiği
        // ödevde anlaşımadığından dolayı ortalama tüm ders sayısına bölünmüştür.


        if(matematik>100||matematik<0){
             average=(fizik+turkce+kimya+muzik)/5;
        }
        if(fizik>100||fizik<0){
             average=(matematik+turkce+kimya+muzik)/5;
        }
        if(turkce>100||turkce<0){
             average=(matematik+fizik+kimya+muzik)/5;
        }
        if(kimya>100||kimya<0){
             average=(matematik+fizik+turkce+muzik)/5;
        }
        if(muzik>100||muzik<0){
             average=(matematik+fizik+turkce+kimya)/5;
        }
        if(average<=55) {
            System.out.println("Sinifta kaldiniz.");

        }
        else if(average>=55){
                System.out.println("Tebrikler! Sinifi gectiniz.");
            }
        System.out.print("Ders ortalamaniz:"+average);
        }

    }

//HAVA SICAKLIĞINA GÖRE ETKİNLİK

import java.util.Scanner;

public class Havasicakliginagöreetkinlik {

    public static void main(String[]args){
        int sicaklik;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bugun hava kac derece?:");

        sicaklik= inp.nextInt();

        if(sicaklik<5){
            System.out.print("Kayak yapabilirsiniz.");
        }
        else if (sicaklik>=5 && sicaklik<=15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
         if (sicaklik>=10 &&sicaklik<=25){
            System.out.println("Piknige gidebilirsiniz.");
        }
        else if(sicaklik>25) {
            System.out.print("Yuzmeye gidebilirsiniz");
        }
    }
}

