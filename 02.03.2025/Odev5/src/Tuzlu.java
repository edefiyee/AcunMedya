public class Tuzlu extends Yemek{
    @Override
    public void turu() {
        System.out.println("Bu yemek tuzludur...");
    }

    public Tuzlu(String adı, int kalori) {
        super(adı, kalori);
    }
}
