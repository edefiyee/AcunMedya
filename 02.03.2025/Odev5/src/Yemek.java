public abstract class Yemek {
    private String Adı;
    private int kalori;

    public Yemek(String adı, int kalori) {
        Adı = adı;
        this.kalori = kalori;
    }
    public abstract void turu();

    public void Yemekbilgileri(){
        System.out.println("Adı:"+Adı+" kalori:"+kalori);
    }
}
