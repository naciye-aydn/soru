import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Random ran = new Random();

    public static String metot1() {
        System.out.println("kullanıcın cinsiyetini giriniz");
        String kız_erkek = scan.next();
        return kız_erkek;
    }

    public static int metot2() {
        System.out.println("kullanıcının yaşını giriniz");
        int yaş = scan.nextInt();
        return yaş;
    }

    //Programcı 1 :  Aşağıda verilen kodları yazar ve githuba upload eder.
    //Metot P1-1 : Bir metot yaz bu metot bizden erkek mi kız mı olduğumuz bilgisini alsın ve metot bu bilgiyi döndürsün.
    //Metot P1-2: Bir metot yaz bu metot bizden yaşımızın kaç olduğu bilgisini alsın ve metot bu bilgiyi döndürsün. (MAX 40 , MİN 20)
    public static void main(String[] args) {


    }

    public static String[] metot_cinsiyet() {
        String cinsiyetler[] = new String[20];
        cinsiyetler[0] = metot1();
        for (int i = 1; i < 20; i++) {
            int cinsiyet_seçimi = ran.nextInt(2);
            if (cinsiyet_seçimi == 0) {
                cinsiyetler[i] = "kız";
            } else {
                cinsiyetler[i] = "erkek";
            }
        }
        return cinsiyetler;
    }

    public static int[] metot_yas() {
        int yaş[] = new int[20];
        yaş[0] = metot2();
        for (int i = 1; i < 20; i++) {
            yaş[i] = ran.nextInt(20) + 21;
        }
        return yaş;
    }

    /*
Programcı 2 : Programcı 1’in yazmış olduğu github projesini indirir. Aşağıdaki metotları ekler ve güncellemeri githuba gönderir.
Metot P2-1 : Bir metot yaz ve bu metot kalan 19 kişinin rastgele oluşturulmuş cinsiyetlerinin olduğu bir array return etsin ve kendi kullanıcımız da bu arrayde olsun P1-1 i kullanarak ekle.
Metot P2-2 : Bir metot yaz ve bu metot kalan 19 kişin rastgele yaşlarını belirlesin ve bu arrayi döndürsün ve kendi kullanıcımız da bu arrayde olsun P1-2 i kullanarak ekle. (YAŞ MAX : 40 , MİN : 20)

 */
    public static int[] metot_sınav1() {

        int[] sınavPuan1 = new int[20];
        for (int i = 0; i < sınavPuan1.length; i++) {
            sınavPuan1[i] = ran.nextInt(101);
        }
        return sınavPuan1;
    }

    public static int[] metot_sınav2() {
        int[] sınavPuan2 = new int[20];
        for (int i : sınavPuan2) {
            sınavPuan2[i] = ran.nextInt(101);
        }
        return sınavPuan2;
    }
/*
Programcı 3 : Son hali indirir ve aşağıdaki metotları githuba gönderir.

Metot P3-1 :  Sınav 1’in HAM puanlarının (0-100) random oluşturulduğu arrayi return eder.

Metot P3-2 :  Sınav 2’in HAM puanlarının (0-100) random oluşturulduğu arrayi return eder.
 */
    /*Programcı 4 : Son hali indirir ve aşağıdaki metotları githuba gönderir.
     Metot P4-1 : P2-1 ve P2-2 den alınan bilgileri kullanarak sınav 1 için puan eklemelerini yapar ve puan eklenmiş arrayi return eder.
     (SINAV PUAN EKLEMELERİ EN ALTTA Info1 OLARAK BELİRTİLMİŞTİR)
     Metot P4-2 : P2-1 ve P2-2 den alınan bilgileri kullanarak sınav 2 için puan eklemelerini yapar ve puan eklenmiş arrayi return eder.
     (SINAV 2 PUAN EKLEMELERİ EN ALTTA Info2 OLARAK BELİRTİLMİŞTİR)


INFO2 (YAZILI SINAV 2 KURALLARI):

	KADINLAR İÇİN :
			  YAŞI 20-25 ARASI ERKEKLERE RANDOM PUANDAN %15 DÜŞÜLÜR
			  YAŞI 20-25 ARASI ERKEKLERE RANDOM PUANA EK %10 EKLENİR
			  YAŞI 20-25 ARASI ERKEKLERE RANDOM PUANDAN %30 DÜŞÜLÜR
ERKEKLER İÇİN :
  YAŞI 20-25 ARASI ERKEKLERE RANDOM PUANDAN %10 DÜŞÜLÜR
			  YAŞI 25-35 ARASI ERKEKLERE RANDOM PUANDAN %20 DÜŞÜLÜR
			  YAŞI 35-40 ARASI ERKEKLERE RANDOM PUANA EK %5 EKLENİR

INFO1 (YAZILI SINAV 1 KURALLARI):
	ERKEKLER İÇİN :
               YAŞI 20-25 ARASI ERKEKLERE RANDOM PUANDAN %10 DÜŞÜLÜR
			  YAŞI 25-35 ARASI ERKEKLERE RANDOM PUANA EK %20 EKLENİR
			  YAŞI 35-40 ARASI ERKEKLERE RANDOM PUANA EK %5 EKLENİR
	KADINLAR İÇİN :
			  YAŞI 20-25 ARASI KADINLARA RANDOM PUANA EK %15 EKLENİR
			  YAŞI 25-35 ARASI KADINLARA RANDOM PUANDAN %10 DÜŞÜLÜR
			  YAŞI 35-40 ARASI KADINLARA RANDOM PUANA EK %30 EKLENİR
     */
    public static int[] P4_1(){
        String cinsiyet[] = metot_cinsiyet();
        int yas[]  =metot_yas();
        int sınav[] = metot_sınav1();

        for (int i = 0; i < sınav.length ; i++) {
          if (cinsiyet[i].equals("kız")){
              if (yas[i]<=25){
                  sınav[i] = sınav[i]/100*15+sınav[i];
              } else if (yas[i]<=35) {
                  sınav[i] = -sınav[i]/100*10+sınav[i];
              } else if (yas[i]<=40) {
                  sınav[i] = sınav[i]/100*30+sınav[i];
              }

          }else {
              if (yas[i]<=25){
                  sınav[i] = -sınav[i]/100*10+sınav[i];
              } else if (yas[i]<=35) {
                  sınav[i] = sınav[i]/100*20+sınav[i];
              } else if (yas[i]<=40) {
                  sınav[i] = sınav[i]/100*5+sınav[i];
              }

          }
        }
        return sınav;
    }

    public static int[] P4_2(){
        String cinsiyet[] = metot_cinsiyet();
        int yas[]  =metot_yas();
        int sınav2[] = metot_sınav2();

        for (int i = 0; i < sınav2.length ; i++) {
            if (cinsiyet[i].equals("kız")){
                if (yas[i]<=25){
                    sınav2[i] = -sınav2[i]/100*15+ sınav2[i];
                } else if (yas[i]<=35) {
                    sınav2[i] = sınav2[i]/100*10+ sınav2[i];
                } else if (yas[i]<=40) {
                    sınav2[i] = -sınav2[i]/100*30+ sınav2[i];
                }

            }else {
                if (yas[i]<=25){
                    sınav2[i] = -sınav2[i]/100*10+ sınav2[i];
                } else if (yas[i]<=35) {
                    sınav2[i] = -sınav2[i]/100*20+ sınav2[i];
                } else if (yas[i]<=40) {
                    sınav2[i] = sınav2[i]/100*5+ sınav2[i];
                }

            }
        }
        return sınav2;
    }


}