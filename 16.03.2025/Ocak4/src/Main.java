import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
       SORU1
       Döngüler, belirli bir koşul sağlandığı sürece kodun tekrar çalışmasını sağlayan yapılar olup
       programlamada verimliliği artırır. Java programlama dilinde döngüler tekrarlayan işlemleri otomatik
       olarak gerçekleştirmek ve kodun daha düzenli, okunabilir ve verimli olmasını sağlamak için kullanılır.
        */

        //SORU2
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //SORU3
        System.out.println("Sayı Giriniz...");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        int toplam = 0;
        for (int i = 1; i <= sayi; i++) {
            toplam += i;
        }
        System.out.println("Girilen sayıya kadar olan sayıların toplamı: " + toplam);



    }
}