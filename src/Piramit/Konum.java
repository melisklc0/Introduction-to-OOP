package Piramit;

public class Konum {
    public double latitude;
    public double longitude;

    public Konum(double latitude, double longitude) {
        if (latitude<0 || latitude>180)
            throw new IllegalArgumentException("Yanlış aralık girildi");
        this.latitude = latitude;

        if (longitude<0 || longitude>360)
            throw new IllegalArgumentException("Yanlış aralık girildi");
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return latitude+ " derece enlem, " +longitude+ " derece boylam noktası";
    }
}
