// tip: each public class is put in its own file
public class SphereCalc3
{
    private double radius, area, volume;

    public void setRadius(double r) {
        radius = r;
        area = 4 * Math.PI * r * r;
        voulme = 4 * Math.PI * Math.pow(r, 3) / 3.0;
    }

    public double getRadius() { return radius; }
    public double getSurfaceArea() { return area; }
    public double getVolume() { return volume; }
}