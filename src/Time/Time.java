package Time;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour,int minute, int second){
        if ( hour<=0 || hour>24 || minute<=0 || minute>=60 || second<=0 || second>=60)
            throw new IllegalArgumentException("Saat, dakika ve/veya saniye değeri yanlış girildi.");
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour,minute,second);
    }

    public String toString(){
        return String.format("%2d:%02d:%02d %s",
                (hour>12)? hour%12:hour, minute,second, (hour<12)? "AM":"PM");
    }
}
