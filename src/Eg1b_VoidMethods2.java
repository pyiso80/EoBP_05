import acm.program.ConsoleProgram;

public class Eg1b_VoidMethods2 extends ConsoleProgram {

   /*
   Start with fixed, 10x5,
    */
   public void run() {

      //10x5
      for (int i = 0; i < 10; i++) {
         print("*");
      }
      println();

      for (int i = 0; i < 3; i++) {

         print("*");
         for (int j = 0; j < 10 - 2; j++) {
            print(" ");
         }
         print("*");
         println();
      }

      for (int i = 0; i < 10; i++) {
         print("*");
      }
      println();

      //7x7
      for (int i = 0; i < 7; i++) {
         print("*");
      }
      println();

      for (int i = 0; i < 5; i++) {

         print("*");
         for (int j = 0; j < 7 - 2; j++) {
            print(" ");
         }
         print("*");
         println();
      }

      for (int i = 0; i < 7; i++) {
         print("*");
      }
      println();

      //15x16
      drawBox(15, 6);

   }

   void drawBox(int w, int h) {
      for (int i = 0; i < w; i++) {
         print("*");
      }
      println();

      for (int i = 0; i < h; i++) {

         print("*");
         for (int j = 0; j < w - 2; j++) {
            print(" ");
         }
         print("*");
         println();
      }

      for (int i = 0; i < w; i++) {
         print("*");
      }
      println();
   }


}