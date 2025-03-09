public class Tuzlu2 implements Yemek2{
    private String adi;
    private String malzemelr;

    public Tuzlu2(String adi, String malzemelr) {
        this.adi = adi;
        this.malzemelr = malzemelr;
    }

    @Override
    public void tat() {
        System.out.println("Bu yemek tuzludur..");
    }

    @Override
    public void bilgileri() {
        System.out.println("yemek adı:");
        System.out.println("Malzemeler:"+malzemelr);

    }
}
