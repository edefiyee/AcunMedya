import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //SORU10
       Scanner scanner = new Scanner(System.in);
        String[] kitaplar = new String[5];
        System.out.println("Lütfen 5 kitap ismi giriniz:");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". kitap: ");
            kitaplar[i] = scanner.nextLine();
        }
        Arrays.sort(kitaplar);
        System.out.println("\n Alfabetik sıralanmış kitaplar: " + Arrays.toString(kitaplar));
        System.out.print("\n Aramak istediğiniz kitabın adını girin: ");
        String arananKitap = scanner.nextLine();
        int index = Arrays.binarySearch(kitaplar, arananKitap);
        if (index >= 0) {
            System.out.println( arananKitap + "\" kitabı dizide " + index + ". indekste bulunuyor.");
        } else {
            System.out.println( arananKitap + "\" kitabı dizide bulunamadı.");
        }
        String[] kopyaDizi = Arrays.copyOfRange(kitaplar, 0, 3);
        System.out.println("İlk 3 kitap: " + Arrays.toString(kopyaDizi));
        String[] yeniDizi = Arrays.copyOf(kitaplar, kitaplar.length);
        System.out.println("Diziler eşit mi? " + Arrays.equals(kitaplar, yeniDizi));
        Arrays.fill(kitaplar, "Rasgele Kitap İsmi");
        System.out.println("Tüm kitap isimleri değiştirildi: " + Arrays.toString(kitaplar));

    }
}

    