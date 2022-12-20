package Time;

public class TimeTest {

    public static void main(String[] args) {
        System.out.println();

        Time time=new Time();
        displayTime("Objenin ilk hali:",time);

        time.setTime(13,27,6);
        displayTime("Obje set edildikten sonra:",time);

        try{
            time.setTime(99,99,99);
        }
        catch (IllegalArgumentException e) {
            System.out.printf("Hata: %s%n%n", e.getMessage());
        }

        displayTime("Hatalı giriş sonrası:",time);

    }

    private static void displayTime(String text, Time t){
        System.out.printf("%s%n Universal time: %s%n Standart time: %s%n%n",text,t.toUniversalString(),t.toString());
    }
}
