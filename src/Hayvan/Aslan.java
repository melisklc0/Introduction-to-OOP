package Hayvan;

public class Aslan extends Hayvan{
    protected String isim;

    public Aslan(int ayakSayisi, String beslenme) {
        super(ayakSayisi, beslenme);
    }

    @Override
    public String getIsim() {return isim;}
    @Override
    public void setIsim(String isim) {this.isim = isim;}

    public String hamYapti(Tavsan t1) {
        if (t1.getHiz()>10)
            return "Tavşan kaçtı";
        else return "Tavşanı yedi";
    }

    @Override
    public String toString() {
        return "İsim: "+getIsim()+
                "\nBeslenme: "+getBeslenme()+
                "\nAyak Sayısı:"+getAyakSayisi();
    }
}
