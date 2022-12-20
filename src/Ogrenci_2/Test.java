package Ogrenci_2;

public class Test {
    public static void main(String[] args) {

        Ders ders1=new Ders("BİL1002","OOP");
        Ogrenci ogrenci1=new Ogrenci("Fırat",1991,"2020137001");
        ogrenci1.dersEkle(ders1);
        Temsilci ogrenci2=new Temsilci("Fatma",1992,"2021123001");

        System.out.println();
        System.out.println(ogrenci1.toString());
        System.out.println();
        System.out.println(ogrenci2.toString());

    }
}
