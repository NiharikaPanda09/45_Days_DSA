import java.util.*;
public class SimplifyPath {
    public static void main(String[] args) {
           String s = "/../abc/./def/";
        System.out.println(simplifyPath(s));
    }
    public static String simplifyPath(String path) {
       Stack<String> st = new Stack<>();
       String cur = "";
       char[] ch = (path + "/").toCharArray();
       for(char c:ch){
           if(c == '/'){
               if(cur.equals("..")){
                   if(!st.isEmpty()){
                       st.pop();
                   }
               }else if(!cur.isEmpty() && !cur.equals(".")){
                   st.push(cur);
               }
               cur = "";
           }
           else{
               cur += c;
           }
       }
       return "/" + String.join("/",st);

    }
}
