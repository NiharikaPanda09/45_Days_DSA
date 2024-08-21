import java.util.*;
public class GroupAnagrams {
    public static void main(String[] args) {
         String [] s = {"tea","ate","eat","tan","bat","nat"};
        System.out.println(groupAnagrams(s));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> res = new HashMap<>();
       for(String s:strs){
           char [] charArray = s.toCharArray();
           Arrays.sort(charArray);
           String sorted = new String(charArray);

           if(!res.containsKey(sorted)){
               res.put(sorted,new LinkedList<String>());
           }
           res.get(sorted).add(s);
       }
       return new LinkedList<>(res.values());
    }
}
