import java.util.*;
public class minmaxfind {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 50, 65, 45, 33, 22, 78, 90};
        int largest1 = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;
    
        for (int i = 0; i < intArray.length; i++) {
          if (intArray[i] > largest1) {
            largest2 = largest1;
            largest1 = intArray[i];
          } else if (intArray[i] > largest2) {
            largest2 = intArray[i];
          }
        }
    
        System.out.println("The two largest numbers in the array are: " + largest1 + " and " + largest2);
      }
    }
    
    

