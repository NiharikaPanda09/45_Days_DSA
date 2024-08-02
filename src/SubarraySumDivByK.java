import java.util.*;
public class SubarraySumDivByK {
    public static void main(String[] args) {
    int [] arr = {4,5,0,-2,-3,1};
    int k = 5;
        System.out.println(subarraysDivByK(arr,k));
    }
    public static int subarraysDivByK(int[] nums, int k) {
        int ct = 0;
        int remainderSum = 0;
        HashMap<Integer, Integer> remainderCt = new HashMap<>();
        remainderCt.put(0, 1);

        for (int num : nums) {
            int rem = (num % k + k) % k;
            remainderSum = (remainderSum + rem) % k;

            if (remainderCt.containsKey(remainderSum)) {
                ct += remainderCt.get(remainderSum);
            }
            remainderCt.put(remainderSum, remainderCt.getOrDefault(remainderSum, 0) + 1);
        }
        return ct;
    }
}
