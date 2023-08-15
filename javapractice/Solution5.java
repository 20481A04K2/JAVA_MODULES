import java.util.* ;
import java.io.*; 
import static java.lang.System.*;
public class Solution5{
    public static int fibonacciNumber(int n){
        // Write your code here.
        int fb=1,k=0;
        int c=1;
        for(int i=1;i<n;i++){
            c=k+fb;
            k=fb;
            fb=c;
       
        }
        return c;

    }
    public static void main(String[] args){
        Scanner a=new Scanner(in);
        int b=a.nextInt();
        for(int i=0;i<b;i++){
            int k=a.nextInt();
            out.println(fibonacciNumber(k));
        }
    }
}