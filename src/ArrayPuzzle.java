import java.util.*;
public class ArrayPuzzle {
    public static void main(String[] args) {
      int[]  nums = {10, 3, 5, 6, 2};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static long[] productExceptSelf(int nums[]) {
    int n = nums.length;
    long [] res = new long[n];

    long[] prefix = new long[n];
    prefix[0] = 1;
    for(int i=1;i<n;i++){
        prefix[i] = prefix[i-1] * nums[i-1];
    }
    long suffix = 1;
    for(int i=n-1;i>=0;i--){
        res[i] = prefix[i] * suffix;
        suffix *= nums[i];
    }
    return  res;
    }
}
