import acm.program.ConsoleProgram;

public class Eg2b_MethodsThatReturnVal extends ConsoleProgram {
   public void run() {

   }

   double rectArea(double w, double l) {
      /*
      double area = w * l;
      return area;
       */

      //
      return w * l;
   }

   int max(int a, int b) {
      if(a > b) {
         return a;
      }else {
         return b;
      }
   }

   boolean isGreater(double x, double y) {
      return x > y;
   }

   boolean isGreater1(double x, double y) {
      boolean b = x > y;
      return b;
   }

   boolean isGreater2(double x, double y) {
      if(x > y) {
         return true;
      }else {
         return false;
      }
   }

   /*
   int addOneToN(int N) {
      int sum = 0;
      for (int i = 1; i <= N; i++) {
         sum += i;
      }
      return sum;
      println("1 to " + N + "added!");//this line cause problem
   }
   */


   /*
   //This will cause compilation error
   char grade(int score) {
      if(score >= 75){
         return 'A';
      }else if(score >= 60) {
         return 'B';
      }else if(score >=40) {
         return 'C';
      }
   }
   */

   void printGrade(int score) {
      if(score >= 75){
         println('A');
         return;
      }else if(score >= 60) {
         println('B');
      }else if(score >=40) {
         println('C');
      }
   }



}