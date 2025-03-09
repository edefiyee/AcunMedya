public abstract class Kitap {
    private String adi;
    private String yazar;

    public Kitap(String adi, String yazar) {
        this.adi = adi;
        this.yazar = yazar;
    }

    public abstract void turu();

    public void KitapBilgileri(){
        System.out.println("Kitap Adı:"+adi+" Yazar:"+yazar);

    }
}
