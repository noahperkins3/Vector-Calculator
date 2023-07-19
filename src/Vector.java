import java.util.*;
import java.io.*;

public class Vector {
   private final int[] vector;

   public Vector(String vector1) {
      vector = new int[3];
      String clean = vector1.replaceAll("\\D+","");
      int nums = Integer.parseInt(clean);
      int count = 100;
      for (int i = 0; i < 3; i++) {
         vector[i] = nums / count % 10;
         count = count / 10;
      }      
   }
   
   public int[] getV() {
      return this.vector;
   }
   
   public String toString() {
      return "<" + this.vector[0] + ", " + this.vector[1] + ", " + this.vector[2] + ">";
   }
   
   public Vector cross(Vector other) {
      int i = (this.vector[1] * other.getV()[2]) - (this.vector[2] * other.getV()[1]);
      int j = -(this.vector[0] * other.getV()[2]) + (this.vector[2] * other.getV()[0]);
      int k = (this.vector[0] * other.getV()[1]) - (this.vector[1] * other.getV()[0]); 
      return new Vector(i + ", " + j + ", " + k);
   }
   
   public int dot(Vector other) {
      int result = 0;
      for (int i = 0; i < 3; i++) {
         result += this.vector[i] * other.getV()[i];
      }
      return result;
   }
   
   public double magnitude() {
      return Math.sqrt(Math.pow(this.vector[0], 2) + Math.pow(this.vector[1], 2) + 
         Math.pow(this.vector[0], 2));
   }
   
   public Vector proj(Vector other) {
      double fraction = this.dot(other) / Math.pow(this.magnitude(), other.magnitude());
      Vector projab = new Vector(this.vector[0] * fraction + ", " + this.vector[1] * fraction +
                                 ", " + this.vector[2] * fraction);
      return projab;
   }
   
}