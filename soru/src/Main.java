import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Random ran = new Random();
    public static void main(String[] args) {
        metot1("kız");
        metot2(25);
        int toplam[] = toplamSınav();
        int count = 0;
        boolean yesNo[] = evetHayir();
        for (int i = 0; i < toplam.length; i++) {
            System.out.print(toplam[i] + " ");
            System.out.println(yesNo[i] + " ");
        }
        System.out.println();
        //! true sayısı bulma
        System.out.println("*************");
        for (int i = 0; i < toplam.length; i++) {
            if (yesNo[i] == true) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println("*************");
        int[] toplamTrue = new int[count];
        int b = 0;
        //! true olan elementleri atama
        for (int i = 0; i <= toplam.length-1 ; i++) {
            if (yesNo[i] == true){
                toplamTrue[b] = toplam[i];
                b++;
            }
        }
        //! sıraya sokulmamış hali
        for (int i = 0; i < toplamTrue.length; i++) {
            System.out.print(toplamTrue[i] + ",");
        }

        Arrays.sort(toplamTrue);
        System.out.println();
        //!sıraya sokulmuş hali
        for (int i = 0; i < toplamTrue.length; i++) {
            System.out.print(toplamTrue[i] + ",");
        }
        System.out.println();
        //! en yüksek puanlı 3 kişiyi yazma
        for (int i = count - 3; i < count ; i++) {
            System.out.print(toplamTrue[i] + ",");
        }
    }
    //! HATA METOT YAŞ VE CİNSYETTE  73. ve 87.satır
    //? CİNSİYETLER = Metot("kız") burada metot tekrar çalışıyor böyle döngüye giriyor
    //? Sıraya koyma işlemi tamam
    //!
    public static String metot1(String cinsiyet) {
        System.out.println("kullanıcın cinsiyetini giriniz");
        String kız_erkek = scan.next();
        return cinsiyet;
    }

    public static int metot2(int yas) {
        System.out.println("kullanıcının yaşını giriniz");
        int yaş = scan.nextInt();
        return yas;
    }

    //Programcı 1 :  Aşağıda verilen kodları yazar ve githuba upload eder.
    //Metot P1-1 : Bir metot yaz bu metot bizden erkek mi kız mı olduğumuz bilgisini alsın ve metot bu bilgiyi döndürsün.
    //Metot P1-2: Bir metot yaz bu metot bizden yaşımızın kaç olduğu bilgisini alsın ve metot bu bilgiyi döndürsün. (MAX 40 , MİN 20)
    /*
    en yuksek puanlari alanlar sira kaybetmeden bul
     */
    public static String[] metot_cinsiyet() {
        String cinsiyetler[] = new String[20];
        cinsiyetler[0] = "kız";
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
        yaş[0] = 25;
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
    public static int[] P4_1() {
        String cinsiyet[] = metot_cinsiyet();
        int yas[] = metot_yas();
        int sınav[] = metot_sınav1();

        for (int i = 0; i < sınav.length; i++) {
            if (cinsiyet[i].equals("kız")) {
                if (yas[i] <= 25) {
                    sınav[i] = sınav[i] / 100 * 15 + sınav[i];
                } else if (yas[i] <= 35) {
                    sınav[i] = -sınav[i] / 100 * 10 + sınav[i];
                } else if (yas[i] <= 40) {
                    sınav[i] = sınav[i] / 100 * 30 + sınav[i];
                }

            } else {
                if (yas[i] <= 25) {
                    sınav[i] = -sınav[i] / 100 * 10 + sınav[i];
                } else if (yas[i] <= 35) {
                    sınav[i] = sınav[i] / 100 * 20 + sınav[i];
                } else if (yas[i] <= 40) {
                    sınav[i] = sınav[i] / 100 * 5 + sınav[i];
                }

            }
        }
        return sınav;
    }

    public static int[] P4_2() {
        String cinsiyet[] = metot_cinsiyet();
        int yas[] = metot_yas();
        int sınav2[] = metot_sınav2();

        for (int i = 0; i < sınav2.length; i++) {
            if (cinsiyet[i].equals("kız")) {
                if (yas[i] <= 25) {
                    sınav2[i] = -sınav2[i] / 100 * 15 + sınav2[i];
                } else if (yas[i] <= 35) {
                    sınav2[i] = sınav2[i] / 100 * 10 + sınav2[i];
                } else if (yas[i] <= 40) {
                    sınav2[i] = -sınav2[i] / 100 * 30 + sınav2[i];
                }

            } else {
                if (yas[i] <= 25) {
                    sınav2[i] = -sınav2[i] / 100 * 10 + sınav2[i];
                } else if (yas[i] <= 35) {
                    sınav2[i] = -sınav2[i] / 100 * 20 + sınav2[i];
                } else if (yas[i] <= 40) {
                    sınav2[i] = sınav2[i] / 100 * 5 + sınav2[i];
                }

            }
        }
        return sınav2;
    }

    /*
Programcı 5: Son hali indirir ve aşağıdaki metotları githuba gönderir.
    Metot P5-1: P4-1’in üstüne saha sınav puanlarını ekler. (SAHA SINAV PUAN HESAPLAMASI Info3 olarak belirtilmiştir.)
	Metot P5-2: P4-2’nin üstüne saha sınav puanlarını ekler (SAHA SINAV PUAN HESAPLAMASI Info3 olarak belirtilmiştir.)

	INFO3 (SAHA KURALLARI)
		              HERKES İÇİN EŞİT (ERKEK VE KADIN)
			20-30 ARASINDAKİ HERKESTEN %5 PUANA EKLENİR.
			30-40 ARASINDAKİ SAHADA BİR AVANTAJI YOKTUR.

     */
    public static int[] P5_1() {

        int[] sınavP5_1 = P4_1();
        int[] yasP5_1 = metot_yas();

        for (int i = 0; i < yasP5_1.length; i++) {
            if (yasP5_1[i] >= 20 && yasP5_1[i] <= 30) {
                sınavP5_1[i] = sınavP5_1[i] + sınavP5_1[i] * 5 / 100;
            }
//            } else if (yasP5_1[i] > 30 && yasP5_1[i] <= 40) {
//                System.out.println("sahada bir avantahjınız yoktur");
//            }
        }
        return sınavP5_1;
    }

    public static int[] P5_2() {
        int[] sınavP5_2 = P4_2();
        int[] yasP5_2 = metot_yas();

        for (int i = 0; i < yasP5_2.length; i++) {
            if (yasP5_2[i] >= 20 && yasP5_2[i] <= 30) {
                sınavP5_2[i] = sınavP5_2[i] + sınavP5_2[i] * 5 / 100;
            } /*else if (yasP5_2[i] > 30 && yasP5_2[i] <= 40) {
                System.out.println("sahada bir avantahjınız yoktur");
            } */

        }
        return sınavP5_2;
    }

    /*
    Programcı 6 : Son hali indirir ve aşağıdaki metotları githuba gönderir.
Metot P6-1  : P5-1 ve P5-2 yi toplar. Jüri evet ya da hayır demiştir herkes için bunu rastgele oluşturur.
Metot P6-2 : P6-1 de Jurinin evet dediği en yüksek puanlı 3 kişiyi sıralar. Ve ekrana yaşlarını cinsiyetlerini yazdırır.

     */
    public static int[] toplamSınav() {
        int sinav1[] = P5_1();
        int sinav2[] = P5_2();
        int toplamSinav[] = new int[20];
        for (int i = 0; i < sinav1.length; i++) {
            toplamSinav[i] = sinav1[i] + sinav2[i];
        }
        return toplamSinav;
    }

    public static boolean[] evetHayir() {
        boolean yesNo[] = new boolean[20];

        for (int i = 0; i < yesNo.length; i++) {
            int random = ran.nextInt(2);

            if (random == 0) {
                yesNo[i] = true;
            } else {
                yesNo[i] = false;

            }
        }
        return yesNo;
    }
}