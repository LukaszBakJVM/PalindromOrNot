

public class Main {
    private static String palindrom="Kajak";
    public static void main(String[] args) {
        boolean palindrome = isPalindrome(palindrom);
        System.out.println(palindrome);

    }
   private static boolean isPalindrome(String word){
       StringBuilder str=new StringBuilder();
        for (int i = word.length()-1; i >=0 ; i--) {
            str.append(word.charAt(i));
        }
       return word.equalsIgnoreCase(str.toString());
   }

}