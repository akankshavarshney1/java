import java.util.*;

public class maxDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int maxDifference = arr[1] - arr[0];
        int minElement = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] - minElement > maxDifference) {
                maxDifference = arr[i] - minElement;
            }
            if(arr[i] < minElement) {
                minElement = arr[i];
            }
        }
        
        System.out.println("Max difference: " + maxDifference);
    }
}