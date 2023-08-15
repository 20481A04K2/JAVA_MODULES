import java.util.*;
import static java.lang.System.*;

import java.lang.invoke.CallSite;
public class RepeatingNumber1 {
    public static int calculate(String digitPattern){
        int v=digitPattern.length();
        char[] num=new char[v];
        for(int i=0;i<digitPattern.length();i++)
        {
            num[i]=digitPattern.charAt(i);
            
        }
      
        for(int i=0;i<digitPattern.length();i++){
            for(int j=i+1;j<digitPattern.length();j++){
                if(num[i]==num[j])
                {
                    out.println(num[i]);
                    return num[i];
 /*The return statement serves two purposes:

It allows us to return the first repeating digit as an integer from the calculate method. This way, if we need to use the result further in the main method or any other part of the program, we can access it through the result variable (in the main method).
It terminates the execution of the calculate method when a repeating digit is found. This is crucial because, without the return statement, the method will continue executing the loop even after finding the first repeating digit, and it will print all the repeating digits, not just the first one.
So, the return statement plays a significant role in both returning the correct result and terminating the method execution when the first repeating digit is found.

Here's a summary of what happens when the first repeating digit is found with the return statement:

First repeating digit is found in the loop.
The digit is printed using out.println.
The return statement is encountered, and the method execution is terminated.
The control is transferred back to the main method.
The program continues execution from where it left off in the main method, after the calculate method was called. */
                 
                }
            }
          
          
        }
        out.println(-1);
        
        return 0;
    }
    public static void main(String[] args){
        Scanner a=new Scanner(in);
        String digitPattern=a.nextLine();
        calculate(digitPattern);
       
     
    }

}
