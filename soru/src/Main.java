import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scan= new Scanner(System.in);
    static Random ran = new Random();
    public static String metot1(){
        System.out.println("kullanıcın cinsiyetini giriniz");
        String kız_erkek= scan.next();
        return kız_erkek;
    }
    public static int metot2(){
        System.out.println("kullanıcının yaşını giriniz");
        int yaş= scan.nextInt();
        return yaş;
    }

    //Programcı 1 :  Aşağıda verilen kodları yazar ve githuba upload eder.
    //Metot P1-1 : Bir metot yaz bu metot bizden erkek mi kız mı olduğumuz bilgisini alsın ve metot bu bilgiyi döndürsün.
    //Metot P1-2: Bir metot yaz bu metot bizden yaşımızın kaç olduğu bilgisini alsın ve metot bu bilgiyi döndürsün. (MAX 40 , MİN 20)
    public static void main(String[] args) {

        
    }
    public static String[] metot_p21(){
        String cinsiyetler[] = new String[20];
        cinsiyetler[0] = metot1();
        for (int i = 1; i < 20; i++) {
            int cinsiyet_seçimi = ran.nextInt(2);
            if(cinsiyet_seçimi==0){
                cinsiyetler[i] = "kız";
            }
            else{cinsiyetler[i] = "erkek";}
        }
        return cinsiyetler;
    }
    public static int[] metot_p22(){
        int yaş[] = new int[20];
        yaş[0] = metot2();
        for (int i = 1; i <20 ; i++) {
            yaş[i] = ran.nextInt(20)+21;
        }
        return yaş;
    }


/*
Programcı 2 : Programcı 1’in yazmış olduğu github projesini indirir. Aşağıdaki metotları ekler ve güncellemeri githuba gönderir.
Metot P2-1 : Bir metot yaz ve bu metot kalan 19 kişinin rastgele oluşturulmuş cinsiyetlerinin olduğu bir array return etsin ve kendi kullanıcımız da bu arrayde olsun P1-1 i kullanarak ekle.
Metot P2-2 : Bir metot yaz ve bu metot kalan 19 kişin rastgele yaşlarını belirlesin ve bu arrayi döndürsün ve kendi kullanıcımız da bu arrayde olsun P1-2 i kullanarak ekle. (YAŞ MAX : 40 , MİN : 20)

 */
}