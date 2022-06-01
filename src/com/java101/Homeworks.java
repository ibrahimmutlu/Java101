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


//KÜÇÜKTEN BÜYÜĞE SIRALAMA
import java.util.Scanner;

public class Kücüktenbüyüge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("1. sayiyi giriniz:");
        a = input.nextInt();

        System.out.print("2.sayiyi giriniz:");
        b = input.nextInt();

        System.out.print("3.sayiyi giriniz:");
        c = input.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.print("a<b<c");
            } else {
                System.out.print("a<c<b");
            }
        }  else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.print("b<a<c");
            } else {
                System.out.print("b<c<a");
            }
        } else  {
            if (a < b) {
                System.out.print("c<a<b");
            } else {
                System.out.print("c<b<a");
            }
        }
    }
}


//BURÇ BULMA

import java.util.Scanner;

public class Burcbulma {

    public static void main(String[] args) {

        int month, day;
        
        String burc = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Dogdugunuz ay: ");

        month = input.nextInt();

        System.out.print("Dogdugunuz gun: ");

        day = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Oglak";
                } else {
                    burc = "Kova";
                }
            }
        }

        if (month == 2) {
            if (day >= 1 && day <= 28) {
                if (day < 20) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            }
        }

        if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    burc = "Balik";
                } else {
                    burc = "Koc";
                }
            }
        }

        if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    burc = "Koc";
                } else {
                    burc = "Boga";
                }
            }
        }
        if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Boga";
                } else {
                    burc = "Ikizler";
                }
            }
        }

        if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "Ikizler";
                } else {
                    burc = "Yengec";
                }
            }
        }

        if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Yengec";
                } else {
                    burc = "Aslan";
                }
            }
        }

        if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Aslan";
                } else {
                    burc = "Basak";
                }
            }
        }

        if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "Basak";
                } else {
                    burc = "Terazi";
                }
            }
        }

        if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            }
        }

        if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            }
        }
        if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Yay";
                } else {
                    burc = "Oglak";
                }
            }
        }

        if(day<1 || day>31 || month<1|| month>12) {
            System.out.println("Hatali giris yaptiniz.Tekrar deneyiniz.");
        }
            else{
                System.out.println("Burcunuz:" + burc);
            }

    }
}



//UÇAK BİLETİ FİYATI HESAPLAMA

import java.util.Scanner;

public class UcakBiletiFiyati {
    
    public static void main(String[]args){

        double km,yas,yolculukTipi,NormalTutar,Yasİndirimi,IndirimliTutar,GidisDonus,ToplamTutar;

        Scanner inp=new Scanner(System.in);

        System.out.print("Mesafeyi km turunden giriniz : ");

        km=inp.nextInt();

        System.out.print("Yasinizi giriniz : ");

        yas=inp.nextInt();

        System.out.print("Yolculuk tipinizi giriniz:");

        yolculukTipi=inp.nextInt();

        NormalTutar = km * 0.10;

        if(yas<12){
           Yasİndirimi = NormalTutar*0.5;
            IndirimliTutar=NormalTutar-Yasİndirimi;
            if(yolculukTipi==1){
                System.out.println("Toplam Tutar : "+IndirimliTutar);
            }else if(yolculukTipi==2){
                GidisDonus=IndirimliTutar*0.2;
                ToplamTutar=(IndirimliTutar - GidisDonus)*2;
                System.out.println("Toplam Tutar : "+ToplamTutar);
            }
            else if((km<0 || yas<0) || (yolculukTipi!=1 && yolculukTipi!=2)){
                System.out.print("Hatali Veri Girdiniz.");
            }

        }
        if(yas>=12&&yas<=24){
            Yasİndirimi = NormalTutar*0.1;
            IndirimliTutar=NormalTutar-Yasİndirimi;
            if(yolculukTipi==1){
                System.out.println("Toplam Tutar : "+IndirimliTutar);
            }else if(yolculukTipi==2){
                GidisDonus=IndirimliTutar*0.2;
                ToplamTutar=(IndirimliTutar - GidisDonus)*2;
                System.out.println("Toplam Tutar : "+ToplamTutar);
            }
            else if((km<0 || yas<0) || (yolculukTipi!=1 && yolculukTipi!=2)){
                System.out.print("Hatali Veri Girdiniz.");
            }

        }

        if(yas>65){
            Yasİndirimi = NormalTutar*0.3;
            IndirimliTutar=NormalTutar-Yasİndirimi;
            if(yolculukTipi==1){
                System.out.println("Toplam Tutar : "+IndirimliTutar);
            }else if(yolculukTipi==2){
                GidisDonus=IndirimliTutar*0.2;
                ToplamTutar=(IndirimliTutar - GidisDonus)*2;
                System.out.println("Toplam Tutar : "+ToplamTutar);
            }
            else if((km<0 || yas<0) || (yolculukTipi!=1 && yolculukTipi!=2)){
                System.out.print("Hatali Veri Girdiniz.");
            }

        }

        if(yas>24&&yas<66){
            if(yolculukTipi==1){
                System.out.println("Toplam Tutar :" +NormalTutar);
            }
            else if(yolculukTipi==2) {
                GidisDonus=NormalTutar*0.2;
                ToplamTutar=(NormalTutar - GidisDonus)*2;
                System.out.println("Toplam Tutar : "+ToplamTutar);
            }
            else if((km<0 || yas<0) || (yolculukTipi!=1 && yolculukTipi!=2)){
                System.out.print("Hatali Veri Girdiniz.");
            }
        }

    }
}


//ÇİN ZODYAĞI BURCU

import java.util.Scanner;

public class CinZodyagı {
    public static void main(String[]args){

        int dogumTarihi;

    Scanner inp=new Scanner(System.in);

    System.out.print("Dogum Yiliniz Kactir :");

    dogumTarihi= inp.nextInt();

    if(dogumTarihi%12==0) {
        System.out.print("Cin Zodyagi Burcunuz : Maymun ");
    }
    else if(dogumTarihi%12==1){
            System.out.print("Cin Zodyagi Burcunuz : Horoz");
        }
        else if(dogumTarihi%12==2){
            System.out.print("Cin Zodyagi Burcunuz : Kopek");
        }
        else if(dogumTarihi%12==3){
            System.out.print("Cin Zodyagi Burcunuz : Domuz");
        }
        else if(dogumTarihi%12==4){
            System.out.print("Cin Zodyagi Burcunuz : Fare");
        }
        else if(dogumTarihi%12==5){
            System.out.print("Cin Zodyagi Burcunuz : Okuz");
        }
        else if(dogumTarihi%12==6){
            System.out.print("Cin Zodyagi Burcunuz : Kaplan");
        }
        else if(dogumTarihi%12==7){
            System.out.print("Cin Zodyagi Burcunuz : Tavsan");
        }
        else if(dogumTarihi%12==8){
            System.out.print("Cin Zodyagi Burcunuz : Ejderha");
        }
        else if(dogumTarihi%12==9){
            System.out.print("Cin Zodyagi Burcunuz : Yilan");
        }
        else if(dogumTarihi%12==10){
            System.out.print("Cin Zodyagi Burcunuz : At");
        }
        else if(dogumTarihi%12==11){
            System.out.print("Cin Zodyagi Burcunuz : Koyun");
        }
    }

}


//ARTIK YIL

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[]args){

        int artikYil;

        Scanner inp=new Scanner(System.in);

        System.out.print("Yil giriniz : ");

        artikYil=inp.nextInt();

        if (artikYil % 100 != 0 && artikYil % 4 == 0) {
                System.out.print(artikYil + " bir artik yildir!");
        } else if(artikYil % 100 == 0 && artikYil % 400 == 0) {
                System.out.print(artikYil + " bir artik yildir!");
         }
            else{
                System.out.print(artikYil + " bir artik yil degildir!");
            }
    }
}



//GİRİLEN SAYIYA KADAR OLAN

import java.util.Scanner;

public class Ucvedordebolunen {

    public static void main(String[]args){

        int k,toplam = 0,terimsayisi=0;

        double ortalama=0;

         System.out.print("Sayi Giriniz : ");

        Scanner inp =new Scanner(System.in);

        k = inp.nextInt();

        for(int i=0; i<=k; i++){

             if(i%12==0){

                 System.out.println(i);

                toplam =toplam + i;

                terimsayisi = terimsayisi+ 1;

            }
             ortalama = toplam / terimsayisi;

        }
        System.out.print("Ortalama : "+ortalama);

    }
}




//TEK SAYILARIN TOPLAMINI BULAN PROGRAM
import java.util.Scanner;

public class Teksayiyakadar {

    public static void main(String[]args){

        Scanner inp=new Scanner(System.in);

        int i;
        int total=0;

        do {

            System.out.println("Enter the number : ");
            i=inp.nextInt();

            if(i%2==0 || i%4==0 || i%100==0){
                total+=i;
            }
        }
        while(i%2==0);
        System.out.println("Total :"+total);
        
    }
}




//GİRİLEN SAYIDAN KÜÇÜK 4 VE 5'İN KUVVETLERİNİ BULAN PROGRAM

import java.util.Scanner;

public class Dortvebesinkuvvetleri {

    public static void main(String[]args){

        int n;

        Scanner scan=new Scanner(System.in);

        System.out.print("Bir sayi giriniz :");

        n= scan.nextInt();

        for(int i=1 ; i<=n; i*=4){

            System.out.println("4 un kuvveti olan sayilar :"+i);
        }
        for(int k=1 ; k<=n; k*=5){

            System.out.println("5 in kuvveti olan sayilar :"+k);
        }
    }
}



// KOMBİNASYON

import java.util.Scanner;

public class Kombinasyon {

    public static void main(String[]args){

        Scanner inp=new Scanner(System.in);

        int n,r,i,deger1=1,deger2=1,deger3=1,kombinasyon;

        System.out.print("Kombinasyonu alinacak sayiyi giriniz : " );

        n = inp.nextInt();

        System.out.print("Kacli kombinasyonu alinacagini giriniz : ");

        r = inp.nextInt();

        for(i=1;i<=n;i++){

            deger1=deger1*i;

        }
        for(i=1;i<=r;i++){

            deger2=deger2*i;

        }

        for(i=1;i<=n-r;i++){

            deger3=deger3*i;
        }

        kombinasyon=deger1/(deger2*deger3);

        System.out.print("Kombinasyon sonucu : "+kombinasyon);
    }

}




//ÜSLÜ SAYI HESAPLAYAN PROGRAM

import java.util.Scanner;

public class Uslusayi {

    public static void main(String[]args){

    Scanner scan=new Scanner(System.in);

    int i,k,l,total=1;

    System.out.print("Ussu alinacak sayiyi giriniz : ");

    k= scan.nextInt();

    System.out.print("Us olacak sayiyi giriniz : ");

    l=scan.nextInt();

    for(i=1 ; i<=l ; i++){

        total*=k;

    }System.out.print("Sonuc : " +total);

    }
}





//BASAMAK TOPLAMI


import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        Scanner input=new Scanner(System.in);

        System.out.print("Sayi Giriniz :");

        int number = input.nextInt();

        int basValue = 0,result=0;

        while (number != 0) {

            basValue = number%10;

            result+=basValue;

            number/= 10;

        }
        System.out.println("sonuc : "+result);

    }
}




//HARMONİK SAYI

import java.util.Scanner;

public class HarmonikSayi {

    public static void main(String[]args){

        Scanner input=new Scanner(System.in);

        System.out.print("Sayi Giriniz : ");

        int k= input.nextInt();
        double result=0;

        for(double i=1 ; i<=k ; i++){

            result+=(1/i);

        }System.out.print("Sonuc : "+result);
    }
}



