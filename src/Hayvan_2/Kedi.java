package Hayvan_2;

public class Kedi extends Hayvan implements IEvcil {
    private String adi;

    public Kedi(int ayakSayisi, String adi) {
        super(ayakSayisi);
        this.adi=adi;
    }

    @Override
    public String yemekTuru() {
        return "Süt içiyor ve et yiyor";
    }

    @Override
    public String oyunOyna() {
        return "İp yumağı ile oynuyor";
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
        return "Kedi:{" +
                "\nAdı=" + adi +
                "\nHareket=" + yuru() +
                "\nYemek=" + yemekTuru() +
                "\nOyun=" + oyunOyna() +
                "\n}";
    }
}
