package Ogrenci_2;

public class Temsilci extends Ogrenci {
    private int sinifDuzeyi;

    public Temsilci(String isim, int dogumYili, String ogrNo) {
        super(isim, dogumYili, ogrNo);
        this.sinifDuzeyi = 2022-super.getGirisYili();
    }

    public int getSinifDuzeyi() {
        return sinifDuzeyi;
    }

    public void setSinifDuzeyi(int sinifDuzeyi) {
        this.sinifDuzeyi = 2022-super.getGirisYili();
    }

    @Override
    public String toString() {
        return "Temsilci{" + super.toString() +
                ", sinifDuzeyi: " + sinifDuzeyi+"}";
    }
}
