package Piramit_2;

public abstract class Prizmatik implements Piramit{
    public String isim;
    public Konum yer;
    private double yukseklik;

    public Prizmatik(String isim) {
        this.isim = isim;
    }

    public abstract double tabanAlanHesapla(double kenar);

    public double getYukseklik() {
        return yukseklik;
    }
    public void setYukseklik(double yukseklik) {
        if (yukseklik<0)
            throw new IllegalArgumentException("Yükseklik negatif olamaz.");
        this.yukseklik = yukseklik;
    }

    @Override
    public String toString() {
        return "---Prizmatik---" +
                "\nİsim: " + isim +
                "\nYer: " + yer.toString() +
                "\nYükseklik: " + yukseklik;
    }
}
