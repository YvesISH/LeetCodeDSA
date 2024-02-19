public class PalindromeDsa{
    public static void main(String[] args){
        String Original = "mom";

        String reverse = "";

       for (int i = Original.length() - 1; i >= 0; i--){
           reverse += Original.charAt(i);
           System.out.println(reverse);
       }

       Boolean palindrome = true;
       for (int i = 0; i < Original.length(); i++) {
           if (Original.charAt(i) != reverse.charAt(i)){
               palindrome = false;
           }
       }

       if (palindrome){
           System.out.println("Palindrome");
       } else {
           System.out.println("Not a Palindrome");
       }
    }
}