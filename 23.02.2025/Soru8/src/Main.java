import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // SORU8
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(7);
        sayilar.add(8);
        sayilar.add(9);
        sayilar.add(10);
        sayilar.add(11);
        sayilar.add(12);
        sayilar.add(13);
        sayilar.add(14);
        int maxsayi = Integer.MIN_VALUE;
        int minsayi = Integer.MAX_VALUE;

        for (int sayi : sayilar) {
            if (sayi > maxsayi) {
                maxsayi = sayi;
            }
            if (sayi < minsayi) {
                minsayi = sayi;
            }
        }

        System.out.println("Max Sayi: " + maxsayi);
        System.out.println("Min Sayi: " + minsayi);



    }


    }
