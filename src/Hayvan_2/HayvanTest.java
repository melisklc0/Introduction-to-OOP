package Hayvan_2;

public class HayvanTest {
    public static void main(String[] args) {

        Cita cita=new Cita(4,"Hızlı");
        Kedi kedi=new Kedi(4,"Pamuk");
        Kanarya kanarya=new Kanarya(2,"Bıcırık");

        System.out.println("\n"+ kanarya.toString());
        System.out.println("\n"+ kedi.toString());
        System.out.println("\n"+ cita.toString());

    }
}
