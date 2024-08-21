import java.util.*;
public class AddBinary {
    public static void main(String[] args) {
          String a = "11";
          String b = "1";
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b) {
        StringBuilder st = new StringBuilder();
         int i = a.length()-1;
         int j = b.length()-1;
         int carry = 0;
         while(i>=0 || j>=0){
             int sum = carry;
             if (i>=0) sum += a.charAt(i--) -'0';
             if(j>=0) sum += b.charAt(j--) - '0';
             st.append(sum%2);
             carry = sum/2;

         }
         if(carry != 0){
             st.append(carry);
         }
         return st.reverse().toString();
    }
}
