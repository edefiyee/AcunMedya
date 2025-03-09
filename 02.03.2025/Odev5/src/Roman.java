public class Roman extends Kitap{
    public Roman(String adi, String yazar) {
        super(adi, yazar);
    }

    @Override
    public void turu() {
        System.out.println("Bu kitap roman türündedir.");

    }
}
