package io.learnstuff.tutorial.Palindrome;

public class Palindrome {
    public static void main(String[] arg){
        System.out.println(Palindrome.isPalindrome("add"));
    }

    public static boolean isPalindrome(String string){
        int length = string.length();
        String reverse = "";
        for(int i = length - 1; i >= 0; i--)
            reverse = reverse + string.charAt(i);
        if(string.equals(reverse))
            return true;
        else
           return false;
    }
}
