import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        SORU1-2
        Java, nesne yönelimli bir programlama dilidir. Java ile yazılan kodlar, `.java` uzantılı
        kaynak dosyaları olarak başlar.Bu dosyalar, Java'nın `javac` adındaki derleyicisi tarafından
        derlenir ve bytecode dosyalarına (`.class` uzantılı) dönüştürülür.Bytecode, Java Virtual Machine (JVM)
        tarafından çalıştırılır. JVM, bytecode'u alarak hedef işletim sistemi üzerinde çalıştırmak
        için uygun hale getirir. Böylece Java programları, farklı platformlarda çalışabilen taşınabilir
        uygulamalar haline gelir.
        JVM:Sanal makine.Java bytecodeları çalıştıran sanal makine
        JDK(JAVA DEVELOPMENT KIT):Java geliştirme araçlarını içeren derleyici.(JRE+JVM+DERLEYİCİ içeren kit)
        JRE(JAVA RUNTİME ENVİRONMENT):JVM ile JDK ÇALIŞMASI İÇİN GEREKLİ KÜTÜPHANELERİ İÇERİR.
    */
        System.out.println("Adınızı giriniz...");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);





    }
}