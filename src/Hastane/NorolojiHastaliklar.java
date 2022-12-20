package Hastane;

public class NorolojiHastaliklar extends Hastalik{
    private int TahminiZaman;

    public NorolojiHastaliklar(String hastalikAdi, int tehlikeSeviyesi, int TahminiZaman) {
        super(hastalikAdi, tehlikeSeviyesi);
        this.TahminiZaman=TahminiZaman;
    }

    public int getTahminiZaman() {
        return TahminiZaman;
    }

    public void setTahminiZaman(int tahminiZaman) {
        this.TahminiZaman = tahminiZaman;
    }

    @Override
    public String semptom() {
        return "Sinirsel Problemler";
    }
}
