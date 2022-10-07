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
        String cinsiyet[] = metot_cinsiyet();
        int[] yaş = metot_yas();

        for (int i = 0; i < toplam.length; i++) {
            System.out.print(toplam[i] + " ");
            System.out.print(yesNo[i] + " ");
            System.out.print(cinsiyet[i] + " ");
            System.out.println(yaş[i]);
        }
        System.out.println("*************");
        for (int i = 0; i < toplam.length; i++) {
            if (yesNo[i] == true) {
                count++;
            }
        }
        int[] cinsiyetTutma = new int[count];
        int countCinsiyet = 0;
        for (int i = 0; i < yesNo.length; i++) {
            if (yesNo[i] == true) {
                cinsiyetTutma[countCinsiyet] = i;
                countCinsiyet++;
            }
        }
        for (int i = 0; i < cinsiyetTutma.length; i++) {
            System.out.print(cinsiyetTutma[i] + ", ");
        }
        System.out.println();
        System.out.println(count);
        System.out.println("*************");
        int[] toplamTrue = new int[count];
        int b = 0;
        for (int i = 0; i <= toplam.length - 1; i++) {
            if (yesNo[i] == true) {
                toplamTrue[b] = toplam[i];
                b++;
            }
        }
        for (int i = 0; i < toplamTrue.length; i++) {
            System.out.print(toplamTrue[i] + ",");
        }

        Arrays.sort(toplamTrue);
        System.out.println();
        for (int i = 0; i < toplamTrue.length; i++) {
            System.out.print(toplamTrue[i] + ",");
        }
        System.out.println();
        for (int i = count - 3; i < count; i++) {
            System.out.print(toplamTrue[i] + ",");
        }
    }

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

    public static int[] P5_1() {

        int[] sınavP5_1 = P4_1();
        int[] yasP5_1 = metot_yas();

        for (int i = 0; i < yasP5_1.length; i++) {
            if (yasP5_1[i] >= 20 && yasP5_1[i] <= 30) {
                sınavP5_1[i] = sınavP5_1[i] + sınavP5_1[i] * 5 / 100;
            }
        }
        return sınavP5_1;
    }

    public static int[] P5_2() {
        int[] sınavP5_2 = P4_2();
        int[] yasP5_2 = metot_yas();

        for (int i = 0; i < yasP5_2.length; i++) {
            if (yasP5_2[i] >= 20 && yasP5_2[i] <= 30) {
                sınavP5_2[i] = sınavP5_2[i] + sınavP5_2[i] * 5 / 100;
            }
        }
        return sınavP5_2;
    }

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