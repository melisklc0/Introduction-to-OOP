package Hastane;

public class Epilepsi extends NorolojiHastaliklar{
    private int epilepsiTipi;

    public Epilepsi(String hastalikAdi, int tehlikeSeviyesi, int TahminiZaman, int epilepsiTipi) {
        super(hastalikAdi, tehlikeSeviyesi, TahminiZaman);
        if (epilepsiTipi<1 || epilepsiTipi>2)
            throw new IllegalArgumentException("Yanlış sayı girdiniz.");
        this.epilepsiTipi=epilepsiTipi;
    }


    public int getEpilepsiTipi() {
        return epilepsiTipi;
    }

    public void setEpilepsiTipi(int epilepsiTipi) {
        if (epilepsiTipi<1 || epilepsiTipi>2)
            throw new IllegalArgumentException("Yanlış sayı girdiniz.");
        this.epilepsiTipi=epilepsiTipi;
    }

    @Override
    public String semptom() {
        if (epilepsiTipi==1)
            return "Vücutta Kasılma";
        else
            return "Kısa Süreli Bilinç Kaybı";
    }

    @Override
    public String toString() {
        return "epilepsiTipi= "+ epilepsiTipi +
                ", semptom= " + semptom();
    }
}
