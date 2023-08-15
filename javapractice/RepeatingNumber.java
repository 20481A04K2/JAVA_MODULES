import java.util.*;
import static java.lang.System.*;
public class RepeatingNumber {
    public static int calculate(String digitPattern){
        int v=digitPattern.length();
        char[] num=new char[v];
        for(int i=0;i<digitPattern.length();i++)
        {
            num[i]=digitPattern.charAt(i);
            
        }
        char First= '0';
        for(int i=0;i<digitPattern.length();i++){
            for(int j=i+1;j<digitPattern.length();j++){
                if(num[i]==num[j]){
                    First=num[i];
                    out.print(First);
                    break ;
                }
            }
            if(First!='0'){
                out.println(First);
                break;
            }
        }
        if (First != '0') {
            out.println("First Repeating Digit: " + First);
        } else {
            out.println("-1");
        }
        
        return 0;
    }
    public static void main(String[] args){
        Scanner a=new Scanner(in);
        String digitPattern=a.nextLine();
        calculate(digitPattern);
     
    }

}
