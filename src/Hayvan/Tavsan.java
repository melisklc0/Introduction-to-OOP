package Hayvan;

public class Tavsan extends Hayvan {
    protected String isim;
    protected int hiz;

    public Tavsan(int ayakSayisi, String beslenme, int hiz) {
        super(ayakSayisi, beslenme);
        this.hiz = hiz;
    }

    @Override
    public String getIsim() {return isim;}
    @Override
    public void setIsim(String isim) {this.isim = isim;}

    public int getHiz() {return hiz;}
    public void setHiz(int hiz) {this.hiz = hiz;}

    @Override
    public String toString() {
        return "İsim: "+getIsim()+
                "\nAyakSayısı:"+getAyakSayisi()+
                "\nHızı: "+getHiz()+"\n";
    }


}
