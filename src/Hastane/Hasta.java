package Hastane;

public class Hasta {
    private String hastaAdi;
    private int yas;
    private Hastalik hastalik;

    public Hasta(String hastaAdi, int yas, Hastalik hastalik) {
        this.hastaAdi = hastaAdi;
        this.yas = yas;
        this.hastalik = hastalik;
    }

    public Hastalik getHastalik() {
        return hastalik;
    }

    public void setHastalik(Hastalik hastalik) {
        this.hastalik = hastalik;
    }

    @Override
    public String toString() {
        return "Hasta Bilgileri: " +
                "hastaAdi= " + hastaAdi +
                ", yas= " + yas +
                "\nHastalik: " + hastalik +
                "\n";
    }
}
