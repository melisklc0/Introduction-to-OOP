package Piramit_2;

public class Konum {
    private double latitude;
    private double longitude;

    public Konum(double latitude, double longitude) {
        if (latitude<0 || latitude>180)
            throw new IllegalArgumentException("Yanlış sayı aralığı girildi.");
        this.latitude = latitude;

        if (longitude<0 || longitude>360)
            throw new IllegalArgumentException("Yanlış sayı aralığı girildi.");
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        if (latitude<0 || latitude>180)
            throw new IllegalArgumentException("Yanlış sayı aralığı girildi.");
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        if (longitude<0 || longitude>360)
            throw new IllegalArgumentException("Yanlış sayı aralığı girildi.");
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return latitude +" derece enlem, "+ longitude+ " derece boylam noktası";
    }
}
