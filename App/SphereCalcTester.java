import java.util.Scanner;

public class SphereCalcTester {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program will receive some circles, you should input the radius, areas, and volumes./nThis program will check your areas and volumes are correct or not.");
        System.out.println("How many circles you want to check (input an integer then press enter): \n");
        int n = scan.nextInt();
        do {
            Test(n, scan);
        } while ((n = Redo()) > 0);
    }

    private static int Redo() {
        return 0;
    }
    private static void Test(int n, Scanner scan) {
        double[] inputs = new double[n];
        double[] areas = new double[n];
        double[] volumes = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Input radius, area, and volumes, seperated by space: \n");
            inputs[i] = scan.nextInt();
            areas[i] = scan.nextInt();
            volumes[i] = scan.nextInt();
        }

         int passed = 0;
         double r, a, v, A, V;
         SphereCalc c = new SphereCalc(0);
         for (int i = 0; i < inputs.length; i++) {
             r = inputs[i];
             a = areas[i];
             v = volumes[i];

             c.setRadius(r);
             A = c.getSurfaceArea();
             V = c.getVolume();

             if (isNear(A, a)) {
                 passed++;
             } else {
                 System.out.print("FAIL: volume for radius " + r);
                 System.out.println("-- Expected " + A + ", got " + a);
             }
             if (isNear(V, v)) {
                 passed++;
             } else {
                 System.out.print("FAIL: volume for radius " + r);
                 System.out.println("-- Expected " + V + ", got " + v);
             }
         }
         if (passed == 2 * inputs.length) {
             System.out.println("PASS: All tests passed.");
         }
    }
     
    
     public static boolean isNear( double a, double b ) {
         return Math.abs(a-b) < 1E-9;
     }
}

class SphereCalc
{
    private double radius, area, volume;

    public SphereCalc(double r) {
        setRadius(r);
    }
    public void setRadius(double r) {
        radius = r;
        area = 4 * Math.PI * r * r;
        volume = 4 * Math.PI * Math.pow(r, 3) / 3.0;
    }

    public double getRadius() { return radius; }
    public double getSurfaceArea() { return area; }
    public double getVolume() { return volume; }
}