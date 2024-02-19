import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraysIntersection {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> solution = new ArrayList<>();

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length && k < arr3.length){
            if (arr1 == arr2 && arr2 == arr3){
                solution.add(arr1[i]);
                i++;
                j++;
                k++;
            }
            else if (arr1[i] > arr2[j] && arr1[i] > arr3[k])
            {
                i++;
            }
            else if (arr2[j] > arr1[i] && arr2[j] > arr3[k]){
                j++;
            }
            else {
                k++;
            }
        }
        return solution;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the 1st array");
        int size1 = scan.nextInt();
        System.out.println("Enter the size of the 2nd Array");
        int size2 = scan.nextInt();
        System.out.println("Enter the size of the 3rd Array");
        int size3 = scan.nextInt();


        System.out.println("Enter the elements of the 1st Array");
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i ++){
            arr1[i] = scan.nextInt();
        }

        System.out.println("Enter the elements of the 2nd Array");
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++){
            arr2[i] = scan.nextInt();
        }

        System.out.println("Enter the elements of the 3rd Array");
        int[] arr3 = new int[size3];
        for (int i = 0; i < size3; i++){
            arr3[i] = scan.nextInt();
        }
    }
}
