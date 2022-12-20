package Hayvan_2;

public abstract class Hayvan {

    protected int ayakSayisi;

    public Hayvan(int ayakSayisi) {
        this.ayakSayisi=ayakSayisi;
    }

    public abstract String yemekTuru();

    public String yuru(){
        if (ayakSayisi==4)
            return "Bu hayvan 4 ayak üzerinde yürüyor";
        else if(ayakSayisi==2)
            return "Bu hayvan 2 ayak üzerinde yürüyor";
        else return "bilinmiyor";
    }

}
