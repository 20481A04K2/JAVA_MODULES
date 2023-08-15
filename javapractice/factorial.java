import java.util.*;
import static java.lang.System.*;
public class factorial {
    public static void main(String args[]){
        Scanner a=new Scanner(in);
        int b=a.nextInt();
        int fact=1;
        for(int i=1;i<=b;i++){
            fact=fact*i;
        }
        out.println("Fact:"+fact);
    }
    
}
