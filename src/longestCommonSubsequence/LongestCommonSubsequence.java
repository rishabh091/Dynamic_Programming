package longestCommonSubsequence;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        String str2 = "aggtab";
        String str1 = "gxtxayb";

        System.out.println("Longest Common Subsequence : "+longestCommonSubsequence(str1,str2));
    }
    private static int longestCommonSubsequence(String str1,String str2){
        //why +1 to size, to create an additional column for the initial count value i.e 0
        int[][] arr=new int[str1.length()+1][str2.length()+1];

        //initializing rows and columns as 0 starting values
        for(int i=0;i<arr.length;i++){
            arr[i][0]=0;
        }
        for(int i=0;i<arr[1].length;i++){
            arr[0][i]=0;
        }

        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1]+1;
                }
                else{
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }

        //largest in a 2d-array

        return arr[arr.length-1][arr[0].length-1];
    }
}
