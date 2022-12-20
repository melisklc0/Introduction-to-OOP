package Hastane;

public class HastaneTest {
    public static void main(String[] args) {
        Hastalik ep1= new Epilepsi("Jeneralize Nöbet",3,1,1);
        Hasta hasta1= new Hasta("John Due", 32,ep1);
        System.out.println(hasta1.toString());
        ((Epilepsi) hasta1.getHastalik()).setEpilepsiTipi(2);
        hasta1.getHastalik().setHastalikAdi("Absans Nöbet");
        System.out.println(hasta1.toString());
    }

}
