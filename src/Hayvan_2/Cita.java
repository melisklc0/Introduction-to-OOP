package Hayvan_2;

public class Cita extends Hayvan {
    private String adi;

    public Cita(int ayakSayisi, String adi) {
        super(ayakSayisi);
        this.adi=adi;
    }

    @Override
    public String yemekTuru() {
        return "Et yiyor";
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Override
    public String toString() {
        return "Cita:{" +
                "\nAdı=" + adi +
                "\nHareket=" + yuru() +
                "\nYemek=" + yemekTuru() +
                "\n}";
    }
}
