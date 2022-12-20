package Hastane;

public abstract class Hastalik {
    private int tehlikeSeviyesi;
    private String hastalikAdi;

    public Hastalik(String hastalikAdi,int tehlikeSeviyesi) {
        this.hastalikAdi = hastalikAdi;
        if (tehlikeSeviyesi<0 || tehlikeSeviyesi>5)
            throw new IllegalArgumentException("1-5 arasında olmalı");
        this.tehlikeSeviyesi=tehlikeSeviyesi;
    }

    public int getTehlikeSeviyesi() {
        return tehlikeSeviyesi;
    }

    public void setTehlikeSeviyesi(int tehlikeSeviyesi) {
        if (tehlikeSeviyesi<0 || tehlikeSeviyesi>5)
            throw new IllegalArgumentException("1-5 arasında olmalı");
        this.tehlikeSeviyesi=tehlikeSeviyesi;
    }

    public String getHastalikAdi() {
        return hastalikAdi;
    }

    public void setHastalikAdi(String hastalikAdi) {
        this.hastalikAdi = hastalikAdi;
    }

    public abstract String semptom();

    @Override
    public String toString() {
        return  "hastalikAdi= " + hastalikAdi +
                ", tehlikeSeviyesi= " + tehlikeSeviyesi;
    }
}
