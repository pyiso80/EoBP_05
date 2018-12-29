import acm.program.ConsoleProgram;

public class Eg3b_Chars extends ConsoleProgram {
   public void run() {

      char uppercaseA = 'A'; // Actually 65
      char lowercaseA = 'a'; // Actually 97
      char zeroDigit = '0'; // Actually 48

      println('A');//no conversion taken place

      //converted A's ascii integer value
      println(uppercaseA + 0);
      println('A' + 0);

      boolean areEqual = 'A' == 'A'; // true
      boolean earlierLetter = 'f' < 'c'; // false
      char uppercaseB = 'A' + 1;
      int diff = 'c' - 'a'; // 2
      int numLettersInAlphabet = 'z' - 'a' + 1; // or
      int numLettersInAlphabet1 = 'Z' - 'A' + 1;

      // prints out every character
      for (char ch = 'a'; ch <= 'z'; ch++) {
         print(ch);
      }
      println();

      //char type casting

      println((char) ('A' + 1));


   }
}