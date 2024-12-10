public class Cylinder {
    double radius ;
    double height ;
    public double calculateVolume(double radius, double height ) {
        double volume = Math.PI * Math.pow(radius, 2) * height;
        // Round the volume to 2 decimal places
        return Math.round(volume * 100.0) / 100.0;
    }
}
