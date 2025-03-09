public class Siir extends Kitap{
    public Siir(String adi, String yazar) {
        super(adi, yazar);
    }

    @Override
    public void turu() {
        System.out.println("Bu kitap şiir türündedir.");

    }
}
