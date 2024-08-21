import java.util.*;
public class Combination {
    public static void main(String[] args) {
          int n = 4;
          int k = 2;
        System.out.println(combine(n,k));
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(1,n,k,list,res);
        return res;

    }
    public static void backtrack(int start,int n ,int k, List<Integer> list,List<List<Integer>> res){
        if(list.size() == k){
            res.add(new ArrayList<>(list));
            return ;
        }
        for(int i = start;i<=n ;i++){
            list.add(i);
            backtrack(i+1,n,k,list,res);
            list.remove(list.size()-1);
        }
    }
}
