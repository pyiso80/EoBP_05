import acm.program.ConsoleProgram;

public class MethodThatCallOthers extends ConsoleProgram {
   public void run() {

      double r = readDouble("Enter radius: ");
      double area = circleArea(r);
      println("Area of circle with radius " + r + " is " + area);

   }

   double circleArea(double r) {
      return 3.14 * r * r;
   }

   double areaOfRing(double outerR, double innerR) {
      return circleArea(outerR) - circleArea(innerR);
   }

   double square(double x) {
      return x * x;
   }

   double sumOfSquare(double x, double y) {
      return square(x) + square(y);
   }

   int sumToN(int n) {
      int sum = 0;
      for(int i = 1; i <= n; i++) {
         sum += i;
      }
      return sum;
   }



}