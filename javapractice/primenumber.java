import java.util.*;
import static java.lang.System.*;
public class primenumber{
    public static void main(String args[]){
        Scanner a=new Scanner(in);
        int b=a.nextInt();
        int count=0;
        if(b>1){
            for(int i=1;i<=b;i++){
                if(b%i==0){
                    count++;
                    out.println(i);
                }
            }
            if(count==2){
                out.println("prime number");
            }
        } 

    }
}