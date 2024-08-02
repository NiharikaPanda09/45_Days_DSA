import java.util.*;
public class MaximumPointsFromCards {
    public static void main(String[] args) {
          int[] max = {6,2,3,4,7,2,1,7,1};
          int k = 4;
        System.out.println(maxScore(max,k));
    }
    public static int maxScore(int[] cardPoints, int k) {
           int lsum = 0;
           int rsum = 0;
           int maxsum = 0;
           int n = cardPoints.length;
           for(int i=0;i<k;i++){
               lsum = lsum + cardPoints[i];
           }
        maxsum = lsum;
           int rindex = n-1;
           for(int i=k-1;i>=0;i--){
               lsum = lsum - cardPoints[i];
               rsum = rsum + cardPoints[rindex];


               maxsum = Math.max(maxsum,lsum+rsum);
               rindex = rindex-1;
           }
           return maxsum;


    }
}
