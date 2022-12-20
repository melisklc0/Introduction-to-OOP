package Piramit;

public abstract class Prizmatik {
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
            throw new IllegalArgumentException("0'dan küçük olamaz");
        this.yukseklik = yukseklik;
    }

    @Override
    public String toString() {
        return "---Prizmatik---" +
                "\nİsim: " + isim +
                "\nKonum: " + yer.toString();
    }
}
