import java.util.*;
import static java.lang.System.*;
public class ReverseString {
    public static void main(String args[]){
        Scanner a=new Scanner(in);
        String str=a.nextLine();
        String rev=" ";
        String revs=" ";
        int b=str.length();
        a.close();
        //using logic
        for(int i=b-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        out.println("logic:"+rev);
        //using char array
        char c[]=str.toCharArray();
        for(int i=b-1;i>=0;i--){
            revs=revs+c[i];
        }
        out.println("char Array:"+revs);
        //using StringBuffer
        StringBuffer sb=new StringBuffer(str);
        out.println("StringBuffer:"+sb.reverse());
        //using StringBuilder
        StringBuilder sb1=new StringBuilder();
        sb1.append(str);
        //StringBuilder rv=sb1.reverse();
        //out.println("StringBuilder:"+rv); or
        /*By replacing rv with sb1.reverse(), the out.println() statement tries to concatenate a StringBuilder object with a string using the + operator. This is not allowed because the + operator between a String and a StringBuilder object is not defined.
        To fix the error and obtain the desired output, you should use the toString() method to convert the reversed StringBuilder object to a String. */
        out.println("StringBuilder:"+sb1.reverse().toString());
    }
    
}
