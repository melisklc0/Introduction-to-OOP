package Hayvan_2;

public class Kanarya extends Hayvan implements IEvcil {
    private String adi;

    public Kanarya(int ayakSayisi, String adi) {
        super(ayakSayisi);
        this.adi = adi;
    }

    @Override
    public String yemekTuru() {
        return "Kuş yemi yiyor";
    }

    @Override
    public String oyunOyna() {
        return "Şarkı söylüyor";
    }

    @Override
    public void setAdi(String adi) {
        this.adi=adi;
    }

    @Override
    public String getAdi() {
        return adi;
    }

    @Override
    public String toString() {
        return "Kanarya:{" +
                "\nAdı=" + adi +
                "\nHareket=" + yuru() +
                "\nYemek=" + yemekTuru() +
                "\nOyun=" + oyunOyna() +
                "\n}";
    }
}
