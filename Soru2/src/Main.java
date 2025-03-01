import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //SORU2
        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1};

        HashSet<Integer> kontrol = new HashSet<>();
        HashSet<Integer> tekrarEdenler = new HashSet<>();

        for (int num : numbers) {
            if (!kontrol.add(num)) {
                tekrarEdenler.add(num);
            }
        }
        
        System.out.println("Tekrar eden sayılar: " + tekrarEdenler);
        }
    }
