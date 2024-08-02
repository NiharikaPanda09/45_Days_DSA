import java.util.*;
public class FindTheDuplicateArray {
    public static void main(String[] args) {
         int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            int x = Math.abs(nums[i]);
            if(nums[x-1] < 0){
                list.add(x);
            }
            nums[x-1] *= -1;
        }
        return list;
    }

}
