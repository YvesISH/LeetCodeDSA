import java.util.Scanner;

public class MinimumNumber {
    public static int findMinimum(int[] arr){
        int minimum = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }

    public static void main(String args[]){
        int arr[] = {100, 6, 7, 8, 3};
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
        int min = findMinimum(arr);
        System.out.println("Minimum array" + min);
    }
}
