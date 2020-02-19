package binomialCoefficient;

public class BinomialCoefficient {

    public static void main(String[] args) {
        int n=4,k=2;

        System.out.println("C(4,2) = "+binomialCoeff(4,2));
    }
    private static int binomialCoeff(int n,int k){
        int[][] arr=new int[n+1][k+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<Math.min(i,k)+1;j++){
                if(j == i || j == 0){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }

        return arr[n][k];
    }
}
