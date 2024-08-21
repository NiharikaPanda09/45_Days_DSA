import java.util.*;
public class ValidPallindromeII {
    public static void main(String[] args) {
             String s = "abcda";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
        int left = 0;
        int right =s.length()-1;
        while(left <right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                if (isPallindrome(left + 1, right, s)) {
                    return true;
                }

            if (isPallindrome(left, right -1, s)) {
                return true;
            }
            return false;
        }

        }
        return true;
    }
   public static boolean isPallindrome(int left,int right,String s){
      while(left < right){
          if(s.charAt(left) != s.charAt(right)){
              return false;
          }
          left++;
          right--;

      }
      return true;
   }
}
