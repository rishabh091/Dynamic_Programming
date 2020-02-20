package stairProblem;

public class StairProblem {
    public static int fibonacci(int n) {
        int[] arr=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        arr[2]=2;

        if(n == 0){
            return 1;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        else{
            for(int i=3;i<=n;i++){
                arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
            }
        }

        return arr[n];
    }
    public static void main(String[] args) {
        int n = 40;
        int k = fibonacci(n);
        System.out.println(k);
    }
}
