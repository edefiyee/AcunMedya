import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //SORU5
       Scanner scanner2 = new Scanner(System.in);
        ArrayList<String> kelimeler = new ArrayList<>();

        System.out.println("10 Tane Kelime Giriniz...");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Kelimeyi girin: ");
            String kelime = scanner2.nextLine();
            kelimeler.add(kelime);
        }
        Collections.sort(kelimeler);
        System.out.println("\nAlfabetik sıraya göre kelimeler:");
        for (String kelime : kelimeler) {
            System.out.println(kelime);
        }

    }
}