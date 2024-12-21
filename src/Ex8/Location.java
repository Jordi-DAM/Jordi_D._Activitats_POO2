package Ex8;

public class Location {

    private double latitude;
    private double longitude;
    private String city;

    public Location(double latitude, double longitude, String city) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.city = city;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Dades del terratremol:" + "\n"
                + "Latitud: " + latitude + "\n"
                + "Longitud " + longitude + "\n"
                + "Ciutat: " + city;

    }

}
