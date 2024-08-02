import java.util.*;
public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 5;
        System.out.println(subarraySum(arr, k));
    }
    public static  int subarraySum(int[] nums, int k) {
         HashMap<Integer,Integer> map= new HashMap<>();
         int ct =0;
         int preSum = 0;
         map.put(0,1);
         for(int i=0;i< nums.length;i++){
             preSum += nums[i];
             int remove = preSum-k;
             ct += map.getOrDefault(remove,0);
             map.put(preSum, map.getOrDefault(preSum,0)+1);
         }
         return ct;
    }
}
