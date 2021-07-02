package challenges.interview;

import java.util.Arrays;

public class interview {
    public static void main(String[] args) {
        Fib(10);
        System.out.println(FibRurusive(10)); 
    }

    public static void Fib(int num){
        int[] arr= new int[num+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=0;i<=num;i++){
if(i<num-1){ arr[i+2]=arr[i]+arr[i+1];}
        }
        System.out.print(arr[num]);
    }
    static int nth=0;
    static int n1=0;
    static int n2=1;
    public static int FibRurusive(int n){
        
        if(n>1){
nth=n1+n2;
n1=n2;
n2=nth;
FibRurusive(n-1);
return nth;
        }
        else if(n==1){
return 1;
        } 
        return 0;
    }
    
}
