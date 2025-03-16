import entity.ProgrammingLanguage;
import service.ProgrammingLanguageManager;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                ProgrammingLanguageManager languageManager = new ProgrammingLanguageManager();

                while (true) {
                    System.out.println("\n1 - Programlama Dili Ekle");
                    System.out.println("2 - Tüm Programlama Dillerini Görüntüle");
                    System.out.println("3 - Çıkış");
                    System.out.print("Seçiminiz: ");
                    int secim = scanner.nextInt();
                    scanner.nextLine();  // Bu satır, nextInt() sonrası boşluğu temizler

                    if (secim == 1) {
                        System.out.print("Programlama dili adı: ");
                        String name = scanner.nextLine();
                        // ID'yi String olarak ekle
                        String id = String.valueOf(languageManager.getAll().size() + 1);
                        languageManager.add(new ProgrammingLanguage(id, name));
                    } else if (secim == 2) {
                        // Tüm programlama dillerini görüntüleme
                        languageManager.getAll().forEach(lang -> System.out.println(lang.getId() + " - " + lang.getName()));
                    } else if (secim == 3) {
                        System.out.println("Çıkış yapılıyor...");
                        break;
                    } else {
                        System.out.println("Geçersiz seçim!");
                    }
                }

                scanner.close();
            }
        }

                /*Scanner scanner = new Scanner(System.in);
                ProgrammingLanguageManager languageManager = new ProgrammingLanguageManager();

                while (true) {
                    System.out.println("\n1 - Programlama Dili Ekle");
                    System.out.println("2 - Tüm Programlama Dillerini Görüntüle");
                    System.out.println("3 - Çıkış");
                    System.out.print("Seçiminiz: ");
                    int secim = scanner.nextInt();
                    scanner.nextLine();

                    if (secim == 1) {
                        System.out.print("Programlama dili adı: ");
                        String name = scanner.nextLine();
                        languageManager.add(new ProgrammingLanguage(languageManager.getAll().size() + 1, name));
                    } else if (secim == 2) {
                        languageManager.getAll().forEach(lang -> System.out.println(lang.getId() + " - " + lang.getName()));
                    } else if (secim == 3) {
                        System.out.println("Çıkış yapılıyor...");
                        break;
                    } else {
                        System.out.println("Geçersiz seçim!");
                    }
                }*/
