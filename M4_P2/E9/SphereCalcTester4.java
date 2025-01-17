public class SphereCalcTester4 {
     public static void main( String[] args ) {
    
         SphereCalc4 c = new SphereCalc4(5);
    
         // c.setRadius(5);
         if ( isNear(c.getSurfaceArea(), 314.159265359) )
             System.out.println("PASS: surfaceArea for " + c.getRadius());
         else
             System.out.println("FAIL: surfaceArea not what was expected!");
         if ( isNear(c.getVolume(), 523.598775598) )
             System.out.println("PASS: volume for " + c.getRadius());
         else
             System.out.println("FAIL: volume not what was expected!");
    
         c.setRadius(0.1);
         if ( isNear(c.getSurfaceArea(), 0.125663706) )
             System.out.println("PASS: surfaceArea for " + c.getRadius());
         else
             System.out.println("FAIL: surfaceArea not what was expected!");
         if ( isNear(c.getVolume(), 4.18879E-3) )
             System.out.println("PASS: volume for " + c.getRadius());
         else
             System.out.println("FAIL: volume not what was expected!");
    
        // c.radius = 3; //  error: radius has private access in SphereCalc4
     }
    
     public static boolean isNear( double a, double b ) {
         return Math.abs(a-b) < 1E-9;
     }
}