import acm.program.ConsoleProgram;

public class Eg2c_Arguments extends ConsoleProgram {
   public void run() {

      double a = readDouble("Enter side a: ");
      double b = readDouble("Enter side b: ");
      //Using expressions as method arguments
      double h = Math.sqrt(a * a + b * b);
      println("The hypotenuse: " + h);
      println(Math.pow(Math.abs(-4), 3));

   }
}