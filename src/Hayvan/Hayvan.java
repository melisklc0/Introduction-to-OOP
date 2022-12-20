package Hayvan;

public class Hayvan {
    protected String isim;
    protected int ayakSayisi;
    protected String beslenme;

    public Hayvan(int ayakSayisi, String beslenme) {
        this.ayakSayisi = ayakSayisi;
        this.beslenme = beslenme;
    }

    public String getIsim() {return isim;}
    public void setIsim(String isim) {this.isim = isim;}

    public int getAyakSayisi() {return ayakSayisi;}
    public void setAyakSayisi(int ayakSayisi) {this.ayakSayisi = ayakSayisi;}

    public String getBeslenme() {return beslenme;}
    public void setBeslenme(String beslenme) {this.beslenme = beslenme;}

}
