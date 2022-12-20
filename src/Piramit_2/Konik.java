package Piramit_2;

public class Konik implements Piramit{
    public String isim;
    public Konum yer;
    public double yaricap;
    private double yukseklik;
    public double yanalYukseklik;
    public double alfaAcisi;

    public Konik(String isim) {
        this.isim = isim;
    }

    public double getYukseklik() {
        return yukseklik;
    }
    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }

    @Override
    public double alanHesapla() {
        // Taban alanı + Yanal alan
        return Math.PI*Math.pow(yaricap,2) + Math.PI*yaricap*yanalYukseklik;
    }

    @Override
    public double hacimHesapla() {
        // 1/3 * Taban alanı * Yükseklik
        return (Math.PI * (Math.pow(yaricap,2) * yukseklik)) / 3;
    }

    @Override
    public String toString() {
        return "---Konik---" +
                "\nİsim: " + isim +
                "\nKonum: " + yer +
                "\nYüzey Alanı: " + alanHesapla() +
                "\nHacim: " + hacimHesapla();
    }
}
