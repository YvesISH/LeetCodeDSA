import java.util.Scanner;

public class Permutations {
    static void swap(char [] ar, int i, int fi){
        char temp = ar[i];
        ar[i] = ar[fi];
        ar[fi] = temp;
    }

    static void permutations(char [] ar, int fi){
        if (fi == ar.length - 1){
            System.out.println(ar);
            return;
        }
        for (int i = fi; i < ar.length; i++){
            swap(ar, fi, i);
            permutations(ar, fi + 1);
            swap(ar, fi, i);
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scan.next();
        System.out.println("Permutations of the string " + s + ":");
        permutations(s.toCharArray(), 0);
    }

}
