import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
     SORU1
     Dizi aynı türdeki birden fazla veriyi tek bir yapıda saklamamızı sağlayan bir veri yapısıdır.
     Bir dizi aynı veri tipinden birçok öğeyi içeren bir liste gibi düşünülebilir.
     Dizi içerisindeki her öğe, **index (sıra numarası)** kullanılarak erişilir.Dizilerde index
     numarası 0'dan başlar  yani ilk elemanın indexi `0`, ikinci elemanın indexi `1` şeklinde devam
     eder.Diziler, verileri düzenli bir şekilde saklamak ve hızlı erişim sağlamak  için kullanılır.
     */

        //SORU2
        Scanner scanner = new Scanner(System.in);
        int[] sayilar = new int[5];
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            sayilar[i] = scanner.nextInt();
        }
        System.out.println("\nGirilen sayılar:");
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Eleman " + i + ": " + sayilar[i]);
        }

        //SORU3
        System.out.print("Dizinin eleman sayısını girin: ");
        int n = scanner.nextInt();
        int[] sayilar2 = new int[n];
        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            sayilar[i] = scanner.nextInt();
        }
        int enBuyuk = sayilar[0];
        for (int i = 1; i < n; i++) {
            if (sayilar[i] > enBuyuk) {
                enBuyuk = sayilar[i];
            }
        }
        System.out.println("Dizideki en büyük sayı: " + enBuyuk);




    }
}