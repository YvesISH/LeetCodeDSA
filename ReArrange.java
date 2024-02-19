public class ReArrange {
    public static void reArrange(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                if (arr[i ] != j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    public static void main(String args[]){
        int arr [] = {100, 90, -2, 0, -20, -43, -5, -44, 5};
        System.out.println("Array Before ReArranging:");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");

        reArrange(arr);
        System.out.println("Array After Arrangement: ");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
    }
}
