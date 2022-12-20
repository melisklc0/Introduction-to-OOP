package Hayvan;

public class HayvanTest {
    public static void main(String[] args) {
        System.out.println();

        Tavsan tavsan=new Tavsan(4,"Ot",5);
        Kedi kedi=new Kedi(4,"Et");
        Aslan aslan=new Aslan(4,"Tavşan");

        tavsan.setIsim("Tavşan");
        kedi.setIsim("Kedi");
        aslan.setIsim("Aslan");

        System.out.println(kedi.toString());
        System.out.println(aslan.toString());
        System.out.println("Sonuç->"+aslan.hamYapti(tavsan)+"\n");
        System.out.println(tavsan.toString());

    }
}
