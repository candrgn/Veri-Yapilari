
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        //değikenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;
        int sinir = 50;
        //scanner sınıfını tanımla
        Scanner inputs = new Scanner(System.in);
        
        //kullanıcıdan değerleri al
        System.out.print("matematik notunuzu giriniz");
        mat = inputs.nextInt();
        System.out.print("fizik notunuzu giriniz");
        fizik = inputs.nextInt();
        System.out.print("kimya notunuzu giriniz");
        kimya = inputs.nextInt();
        System.out.print("turkce notunuzu giriniz");
        turkce = inputs.nextInt();
        System.out.print("tarih notunuzu giriniz");
        tarih = inputs.nextInt();
        System.out.print("muzik notunuzu giriniz");
        muzik = inputs.nextInt();
        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = (toplam/6.0);
        boolean durum = (sonuc>=sinir);
        System.out.println("ortalama " + sonuc);
        System.out.println("gecme durumunuz " + durum);
        
    }
}
