import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //SORU9

        ArrayList<String> alarmlar = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n*** ALARM SİSTEMİ ***");
            System.out.println("1- Yeni Alarm Kur");
            System.out.println("2- Alarmı Güncelle");
            System.out.println("3- Alarmı Sil");
            System.out.println("4- Tüm Alarmları Gör");
            System.out.println("5- Tüm Alarmları Temizle");
            System.out.println("6- Çıkış");
            System.out.print("Seçiminiz: ");

            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    System.out.print("Yeni alarmı oluştur: ");
                    String yeniAlarm = scanner.nextLine();
                    alarmlar.add(yeniAlarm);
                    System.out.println(" Alarm eklendi: " + yeniAlarm);
                    break;

                case 2:
                    System.out.println("Değiştirmek istediğiniz alarm numarasını girin (0-" + (alarmlar.size() - 1) + "): ");
                    int indexGuncelle = scanner.nextInt();
                    scanner.nextLine();
                    if (indexGuncelle >= 0 && indexGuncelle < alarmlar.size()) {
                        System.out.print("Saati giriniz: ");
                        String yeniZaman = scanner.nextLine();
                        alarmlar.set(indexGuncelle, yeniZaman);
                        System.out.println("Alarm güncellendi");
                    } else {
                        System.out.println("Geçersiz sayı!");
                    }
                    break;

                case 3:
                    System.out.println("Silmek istediğiniz alarmın numarasını girin (0-" + (alarmlar.size() - 1) + "): ");
                    int indexSil = scanner.nextInt();
                    scanner.nextLine();
                    if (indexSil >= 0 && indexSil < alarmlar.size()) {
                        System.out.println("Alarm silindi: " + alarmlar.get(indexSil));
                        alarmlar.remove(indexSil);
                    } else {
                        System.out.println("Geçersiz sayı!");
                    }
                    break;

                case 4:
                    System.out.println("\n Kurulu Alarmlar:");
                    if (alarmlar.isEmpty()) {
                        System.out.println("Hiç alarm kurulmamış.");
                    } else {
                        for (int i = 0; i < alarmlar.size(); i++) {
                            System.out.println(i + ". " + alarmlar.get(i));
                        }
                    }
                    break;

                case 5:
                    alarmlar.clear();
                    System.out.println("Tüm alarmlar silindi!");
                    break;

                case 6:
                    System.out.println("Çıkış yapılıyor...");
                    return;

                default:
                    System.out.println("Geçersiz seçim!");
            }
        }



    }
}