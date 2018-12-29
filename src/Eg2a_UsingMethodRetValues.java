import acm.program.ConsoleProgram;

public class Eg2a_UsingMethodRetValues extends ConsoleProgram {
   public void run() {
      double val1 = Math.sqrt(4);
      println("Square root of 4 is: " + val1);
      println("Square root of 4 is: " + Math.sqrt(4));

      double val2 = Math.pow(2, 3);
      println("2 to the power 3 is: " + val2);

      double val3 = Math.max(10, 99);
      println("Max is: " + val3);

      double a = readDouble("Enter side a: ");
      double b = readDouble("Enter side b: ");
      double c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));

      //return value is not used
      Math.sqrt(2);


   }
}