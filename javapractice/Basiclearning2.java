import java.util.*;
import static java.lang.System.*;
public class BasicLearning2{
    public static void main(String[] args){
        Scanner a=new Scanner(in);
        int b=Integer.valueOf(a.nextLine());
        String c=a.nextLine();
        for(int i=0;i<b;i++){
            int result1=Character.getNumericValue(c.charAt(i));
            out.println(result);
            out.println(b);
            out.println(result1);
        }
    }
}