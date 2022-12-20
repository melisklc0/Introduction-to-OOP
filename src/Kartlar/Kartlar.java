package Kartlar;

public class Kartlar {
    private final String takimlar;
    private final String yuzler;

    public Kartlar(String takimlar, String yuzler) {
        this.takimlar = takimlar;
        this.yuzler = yuzler;
    }

    public String toString(){
        return yuzler +"-"+ takimlar;
    } //toString() ile iki değişken değeri birleştirip geri döndürür.


}
