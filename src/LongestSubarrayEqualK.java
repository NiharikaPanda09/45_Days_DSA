import java.util.*;
public class LongestSubarrayEqualK {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Example array
        int k = 9; // Example sum
        int N = array.length;
        System.out.println(lenOfLongSubarr(array, N,k));
    }
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maxsum = 0;
        for(int i=0;i<N;i++){
            sum += A[i];

        if(sum == K) {
            maxsum = Math.max(maxsum, i + 1);
        }
        int rem = sum-K;
        if(map.containsKey(rem)){
            int len = i - map.get(rem);
            maxsum = Math.max(maxsum,len);
        }
        if(!map.containsKey(sum)){
            map.put(sum,i);
        }
        }
        return maxsum;
    }
}
