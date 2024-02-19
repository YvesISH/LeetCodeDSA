import java.util.Scanner;

public class DivisorsOfN {
    static void divisor(int n){
        for (int i = 1; i < n; i++){
            if (n % i == 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        System.out.println("The number divided by " + n + ":");
        divisor(n);
    }
}
