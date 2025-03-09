//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Kitap roman=new Roman("Suç ve Ceza","Dosteyevski");
        Kitap siir=new Siir("lavina","Özdemir Asaf");

        roman.KitapBilgileri();
        roman.turu();
        siir.KitapBilgileri();
        siir.turu();

        System.out.println("**************************************");
        Yemek corba=new Tuzlu("Mercimek Çorbası",200);
        Yemek pasta=new Tatli("Brownie",350);

        corba.Yemekbilgileri();
        corba.turu();
        pasta.Yemekbilgileri();
        pasta.turu();

        System.out.println("**************************************");

        //İNTERFACE
        Yemek2 tuzlu=new Tuzlu2("Pilav","pirinç ve su");
        Yemek2 tatli=new Tatlı2("Baklava","yufka ve şerbet");

        tuzlu.bilgileri();
        tuzlu.tat();
        tatli.tat();
        tatli.bilgileri();

        System.out.println("**************************************");

        Kitap2 roman2=new Roman2("körlük","Jose Saramago");
        Kitap2 siir2=new Siir2("Beyaz Kuş","Cemal Süreyya");
        roman2.KitapBilgileri();
        roman2.turu();
        siir2.KitapBilgileri();
        siir2.turu();





    }
}