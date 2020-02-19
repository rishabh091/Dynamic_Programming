package editDistance;

public class EditDistance {

    public static void main(String[] args) {
        String str1="cart";
        String str2="march";

        System.out.println("Edit distance of 2 strings : "+editDistance(str1,str2));
    }
    private static int editDistance(String s1,String s2){
        int[][] arr=new int[s1.length()+1][s2.length()+1];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i == 0){
                    arr[i][j]=j;
                }
                else if(j == 0){
                    arr[i][j]=i;
                }
                else if(s1.charAt(i-1) == s2.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1];
                }
                else{
                    arr[i][j]=min(arr[i-1][j],arr[i-1][j-1],arr[i][j-1])+1;
                }
            }
        }

        return arr[s1.length()][s2.length()];
    }
    private static int min(int a,int b,int c){
        a=Math.min(a,b);

        if(a < c){
            return a;
        }

        return c;
    }
}
