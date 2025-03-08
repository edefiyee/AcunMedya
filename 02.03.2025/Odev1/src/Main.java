import OOP.Manager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Manager manager=new Manager("hüseyin",1,1000,"IT",5);
       double resault= manager.calculateBonus();
       System.out.println(manager.getName()+" "+"isimli çalışanın bonusu:"+resault);
        System.out.println(manager.getId()+" numaralı çalışanın departmanı: "+ manager.getDepartment());



    }
}