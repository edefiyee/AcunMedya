public class Tatli extends Yemek{
    public Tatli(String adı, int kalori) {
        super(adı, kalori);
    }

    @Override
    public void turu() {
        System.out.println("Bu yemek tatlıdır..");
    }

}
