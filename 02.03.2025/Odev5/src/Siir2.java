public class Siir2 implements Kitap2 {
    private String adi;
    private String yazar;

    public Siir2(String adi, String yazar) {
        this.adi = adi;
        this.yazar = yazar;
    }

    @Override
    public void turu() {
        System.out.println("Bu kitap şiir türündedir...");
    }

    @Override
    public void KitapBilgileri() {
        System.out.println("Kitap Adı:"+ adi+"Yazar:"+yazar);

    }
}
