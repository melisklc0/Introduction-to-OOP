package Hayvan;

public class Kedi extends Hayvan {
    protected String isim;
    protected boolean isEvcil;

    public Kedi(int ayakSayisi, String beslenme) {
        super(ayakSayisi, beslenme);
    }

    @Override
    public String getIsim() {return isim;}
    @Override
    public void setIsim(String isim) {this.isim = isim;}

    public boolean isEvcil() {return isEvcil;}
    public void setEvcil(boolean evcil) {isEvcil = evcil;}

    @Override
    public String toString() {
        return "İsim:"+getIsim()+
                "\nBeslenme:"+getBeslenme()+
                "\nAyak Sayısı:"+getAyakSayisi()+
                "\nEvcil mi:"+isEvcil+"\n";
    }

}
