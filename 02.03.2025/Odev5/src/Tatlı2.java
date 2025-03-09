public class Tatlı2 implements Yemek2{
    private String adi;
    private String malzemeler;

    public Tatlı2(String adi, String malzemeler) {
        this.adi = adi;
        this.malzemeler = malzemeler;
    }

    @Override
    public void tat() {
        System.out.println("Bu yemek tatlıdır..");

    }

    @Override
    public void bilgileri() {
        System.out.println("Tatlı Adı: " + adi);
        System.out.println("Malzemeler: " + malzemeler);

    }
}
