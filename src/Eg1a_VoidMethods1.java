import acm.program.ConsoleProgram;

public class Eg1a_VoidMethods1 extends ConsoleProgram {
   public void run() {

   }


   void printHello3Times() {
      println("Hello!");
      println("Hello");
      println("Hello!");
   }

   void countDownFromTen() {
      for(int i = 10; i >= 0; i++) {
         println(i);
      }
   }

   void printNTimes(String s, int n) {
      for(int i = 0; i < n; i++) {
         println(s);
      }
   }

   void countDownFromN(int N) {
      for(int i = N; i >= 0; i++) {
         println(i);
      }
   }

   void draw10x5StarBlock() {
      for(int i = 0; i < 5; i++) {
         for (int j = 0; j < 10 ; j++) {
            print("*");
         }
         println();
      }
   }

   void drawNxMStarBlock(int w, int h) {
      for(int i = 0; i < h; i++) {
         for (int j = 0; j < w ; j++) {
            print("*");
         }
         println();
      }
   }

   void drawNxMCharBlk(char c, int w, int h) {
      for(int i = 0; i < h; i++) {
         for (int j = 0; j < w ; j++) {
            print(c);
         }
         println();
      }
   }
}