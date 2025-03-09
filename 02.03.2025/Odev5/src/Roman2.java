public class Roman2 implements Kitap2{
    private String adi;
    private String yazar;

    public Roman2(String adi, String yazar) {
        this.adi = adi;
        this.yazar = yazar;
    }

    @Override
    public void turu() {
        System.out.println("Bu kitap roman türündedir...");

    }

    @Override
    public void KitapBilgileri() {
        System.out.println("Kitap Adı: " + adi+" Yazarı: "+yazar);

    }
}
