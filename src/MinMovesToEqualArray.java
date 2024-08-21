import java.lang.reflect.Array;
import java.util.*;
public class MinMovesToEqualArray {
    public static void main(String[] args) {
       int[] nums = {1,10,2,9};
        System.out.println(minMoves2(nums));
    }
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
         int ct = 0;
         int mid = nums[nums.length/2];
         for(int num:nums){
             ct += Math.abs(mid-num);
         }
         return ct;
    }
}
