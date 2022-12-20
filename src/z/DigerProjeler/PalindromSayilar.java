package z.DigerProjeler;

import java.util.Scanner;

public class PalindromSayilar {

    public static void main(String[] args) {
        //Palindrom, "radar" ve "madam" gibi hem baştan hem de sondan aynı okunan bir kelimedir.
        //Kullanıcı tarafından girilen bir string in palindrom olup olmadığını kontrol etmek için bir
        //uygulama yazın

        Scanner klavye=new Scanner(System.in);
        System.out.print("\nBir kelime giriniz: ");
        String kelime=klavye.nextLine();
        char [] charDizi=kelime.toCharArray();
        boolean palidromMu=true;
        for (int i = 0; i < charDizi.length; i++) {
            if (charDizi[i] != charDizi[charDizi.length - i - 1]) {
                palidromMu = false;
                break;
            }
        }
        if (palidromMu)
            System.out.println("Palidrom kelimedir.");
        else System.out.println("Palidrom kelime değildir.");





    }
}
