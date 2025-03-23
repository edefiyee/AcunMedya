import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //soru1
        /*
        byte= -128 ile 127 arası değerlere sahip 8 bitlik yer tutar
        short=2 bytelık yer tutar. -32,768 ile 32,767 arasında değerlere sahip
        int=-2.147.483.648 ile 2.147.483.647 değer aralığına sahip 32 bitlik yer tutar
        long=9,223,372,036... değer aralınına sahip 64bitlik yer tutae
        float= 4 bytelık yer tutar yaklaşık ±3.40282347E+38F
        double= 8 bytelık yer tutar yaklaşık ±1.7976931348623157E+308
        char= 2 bytelık yer tutar tek bir Unicode karakterini tutabilir
        boolean= 1 bit, yalnızca true veya false değerlerini alabilir.

        //soru 2
        a bir int 10 ve b ise double türünde 3.5'dür. a'yı otomatik olarak double türüne dönüştürülür.
        Bu iki değerin toplamı 10.0 + 3.5 olur ve sonuç 13.5 olarak hesaplanır.Kodun çıktısı 13.5 olur
         */

        //soru3
        int a;
        int b;
        System.out.println("Sayı giriniz");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        int c=a+b;
        System.out.println("Toplam:"+c);
    }
}