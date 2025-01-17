public class BetterTesting {
     public static void main( String[] args ) {
         double[] inputs = {
             5,
             0.1,
             3.3,
             20000,
             8
         };
         double[] areas = {
             314.159265359,
             0.125663706,
             136.84777599,
             5026548245.743669104,
             804.247719319
         };
         double[] volumes = {
             523.598775598,
             4.18879E-3,
             150.532553589,
             3.3510321638291125E13,
             2144.660584851
         };
         int passed = 0;
         double r, a, v, A, V;
         SphereCalc4 c = new SphereCalc4(0);
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
                 System.out.println("-- Expected " + a + ", got " + A);
             }
             if (isNear(V, v)) {
                 passed++;
             } else {
                 System.out.print("FAIL: volume for radius " + r);
                 System.out.println("-- Expected " + v + ", got " + V);
             }
         }
         if (passed == 2 * inputs.length) {
             System.out.println("PASS: All tests passed.");
         }

         // tester did not distinguish between bad test cases and a wrong formula, 
         // unless added a calculator inside tester to calculate the correct answer.
         // then we can make sure if the input is incorrect or the output is incorrect.
     }
    
     public static boolean isNear( double a, double b ) {
         return Math.abs(a-b) < 1E-9;
     }
}