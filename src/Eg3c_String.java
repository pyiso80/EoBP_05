import acm.program.ConsoleProgram;

public class Eg3c_String extends ConsoleProgram {
   public void run() {

      String s1 = readLine("enter: ");

      boolean b = !(s1.startsWith(" ")) && !(s1.equals("abc"));
      println(" " + b);

      String str = "Hello, world!";
      //gives a sub string string from index 0
      String hello = str.substring(0, 5);

      String worldExclm = str.substring(7, 13);

      String worldExclm1 = str.substring(7);



   }
}