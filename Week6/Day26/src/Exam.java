
public class Exam {
   public static void count(int num) {
      if (num <= 0) {
         System.out.println(0);
      } else {
         System.out.println(num);
         count(num - 1);
         System.out.println(num);
      }
   }
   
   public static void main(String[] args) {
      count(3);
   }
}
