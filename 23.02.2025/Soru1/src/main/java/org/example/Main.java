package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ÖDEV1
        Scanner scanner=new Scanner(System.in);
        double sayi[] =new double[10];
        double toplam=0;
        System.out.println("10 Tane Sayı giriniz:");
        for (int i=0;i<10;i++){
            System.out.print((i+1)+". sayıyı girin: ");
         sayi[i]=scanner.nextDouble();//kullanıcıdan sayı alıyoruz
            toplam+=sayi[i];
            if (sayi[i]>50){
                System.out.println("50'den büyük sayılar:"+sayi[i]);
            }
        }
            double ort=toplam/10;
            System.out.println("Ortalama:"+ort);

    }
}