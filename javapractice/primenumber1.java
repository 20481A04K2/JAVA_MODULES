import java.util.*;
import static java.lang.System.*;
public class primenumber1   
{  
    public static void main(String args[]){
        Scanner a=new Scanner(in);
        int b=a.nextInt();
        int count=0;
        int sum = 0;  
        for(int i=2;i<=b;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0)
            {
                out.println(i);
            }
        }
    }
}