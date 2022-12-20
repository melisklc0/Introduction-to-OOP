package Martian;

public class MartianTest {

    public static void main(String[] args) {

        Martian m1=new Martian("x","okçu");
        System.out.println("Savaşalım mı? "+m1.isFight());

        Martian m2=new Martian("xx","kılıç");
        System.out.println("Savaşalım mı? "+m1.isFight());

        Martian m3=new Martian("xxx","lider");
        System.out.println("Savaşalım mı? "+m1.isFight());

        Martian m4=new Martian("xxxx","casus");
        System.out.println("Savaşalım mı? "+m1.isFight());

        Martian m5=new Martian("xxxxx","haydut");
        System.out.println("Savaşalım mı? "+m1.isFight());

        

    }
}
