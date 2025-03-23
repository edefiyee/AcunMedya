import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        SORU1
        if ifadesi eğer anlamına gelir.Kullanım şekli; Eğer belirttiğim koşul yerine geliyorsa
        şunları gelmiyorsa bunları yap demektir. else ifadesi ise; her iki koşulda yerine gelmiyorsa yapılacak
        işlemi belirtir.koşullu dallanmayı denetler.
        */

        //SORU2
        System.out.println("Bir sayı Giriniz:");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        if (sayi % 2 == 0) {
            System.out.println("Girilen sayı çifttir.");
        }
        else {
            System.out.println("girilen sayı tektir.");
        }

        //SORU3
        System.out.println("Bir sayı Giriniz:");
        int sayi2 = scanner.nextInt();
        if (sayi2>0) {
            System.out.println("sayı pozitiftir.");
        } else if (sayi2<0) {
            System.out.println("sayı negatiftir.");
        }
        else {
            System.out.println("Sayı sıfıra eşittir.");
        }


    }
}