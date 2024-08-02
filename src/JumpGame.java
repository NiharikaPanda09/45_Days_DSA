import java.util.*;
public class JumpGame {
    public static void main(String[] args) {
    int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int gas =0;
        for(int n:nums){
            if(gas<0){
                return false;
            }else if(n > gas){
                gas = n;
            }
            gas--;
        }
        return true;
    }
}
