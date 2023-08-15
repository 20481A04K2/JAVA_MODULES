import java.util.* ;
import java.io.*;

import static java.lang.System.*;

public class Solution1 
{
    public static int calculateSquare(int num) 
    {
        if(num==0||num==1){
            return 1;
        }
        else{
            return num*num;
        }

    }
    public static void main(String[] args){
        Scanner c=new Scanner(in);
        int a=c.nextInt();
        int[] num=new int[a];
        for(int i=0;i<a;i++){
           num[i] =c.nextInt();
        }
        for(int i=0;i<a;i++){
            int fact=calculateSquare(num[i]);
            out.println(fact);
        }
        c.close();

    }
}