package fibbnocci.series;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int limit;
        //using memoization
        int[] arr;

        System.out.println("Enter Limit : ");
        limit=io.nextInt();
        arr=new int[limit+1];
        //pre-defined values of fibonacci series
        arr[0]=0;
        arr[1]=1;
        arr[2]=1;

        System.out.println(fib(limit,arr));
        main(args);
    }

    public static int fib(int limit,int[] arr){
        if(limit == 0){
            return 0;
        }
        else if(limit == 1){
            return 1;
        }
        else if(limit == 2){
            return 1;
        }
        else{
            for(int i=3;i<=limit;i++){
                //fibonacci series formula
                arr[i]=arr[i-1] + arr[i-2];
            }
        }

        return arr[limit];
    }
}
