package Martian;

public class Martian {
    private String isim;
    private String yetenek;
    private static int askerSayisi;

    public Martian(String isim, String yetenek){
        this.isim=isim;
        this.yetenek=yetenek;
        askerSayisi++; //nesne oluştukça sayı artacak
    }
    public static int getAskerSayisi(){
        return askerSayisi;
    }
    public boolean isFight(){
        if (askerSayisi>4) return true;
        else return false;
    }

}
