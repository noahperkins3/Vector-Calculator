import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      boolean play = true;
      while (play) {
         System.out.println("Which function? (type a, b, c, d):");
         System.out.println("a) cross product b) dot product c) magnitude d) proj ab");
         String function = console.nextLine();
         if (function.equals("c")) {
           System.out.println("Input vector (three numbers separated by commas):");  
           String vector = console.nextLine();
           Vector magvector = new Vector(vector);
           System.out.println("Magnitude: " + magvector.magnitude());
         }
         System.out.println("Input vector a (three numbers separated by commas):");
         String vector1 = console.nextLine();
         Vector first = new Vector(vector1);
         System.out.println("Input vector b:");
         String vector2 = console.nextLine();
         Vector second = new Vector(vector2);
         if (function.equals("a")) {
            System.out.println("Cross product:" + first.cross(second));            
         } else if (function.equals("b")) {
            System.out.println("Dot product: " + first.dot(second));
         } else if (function.equals("d")) {
            System.out.println("Proj ab :" + first.proj(second));
         }
         System.out.println("Go again? (y / n)");
         String again = console.next();
         if (again.contains("n")) {
            play = false;
         }
      }
   }   
}