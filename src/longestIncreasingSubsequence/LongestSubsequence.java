package longestIncreasingSubsequence;

import java.util.Arrays;

public class LongestSubsequence {

    public static void main(String[] args) {
        int[] arr={10,22,9,33,21,50,41,60};

        System.out.println("Length of Longest subsequence : "+longestSequence(arr));
    }

    private static int longestSequence(int[] arr){
        int[] count=new int[arr.length];
        Arrays.fill(count,1);

        for(int i=1;i<arr.length;i++){
            for(int j=0;j<=i-1 && arr[j]< arr[i];j++){
                count[i] =  Math.max(count[i],count[j]+1);
            }
        }

        for(int i=0;i<count.length;i++){
            System.out.println(count[i]);
        }

        int result=count[0];
        for(int i=1;i<count.length;i++){
            if(result < count[i]){
                result = count[i];
            }
        }

        return result;
    }
}
