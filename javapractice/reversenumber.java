import java.util.*;
import static java.lang.System.*;
public class reversenumber{
    public static void main(String args[]){
        Scanner a=new Scanner(in);
        int b=a.nextInt();
        a.close();
        int rev=0;
        int revs=b;
        String rv=" ";
        while(b!=0){
            rev=rev*10+b%10;
            b=b/10;
        }
        out.println("logic:"+rev);
        //second approach using StringBuffer
        StringBuffer sb=new StringBuffer(Integer.toString(revs));
        StringBuffer revse=sb.reverse();
        out.println("StringBuffer:"+revse);
        //using StringBuilder class
        //StringBuilder sb1=new StringBuilder(Integer.toString(revs));
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder(String.valueOf(revs));//converts int to string
        sb1.append(revs);
        StringBuilder reverse=sb1.reverse();
        out.println("StringBuilder1:"+reverse);
        out.println(sb2.reverse());
        out.println("StringBuilder1:"+sb2.reverse().toString());
        /* By replacing rv with sb1.reverse(), the out.println() statement tries to concatenate a StringBuilder object with a string using the + operator. This is not allowed because the + operator between a String and a StringBuilder object is not defined.
        To fix the error and obtain the desired output, you should use the toString() method to convert the reversed StringBuilder object to a String. */
        //using char array
        String str=Integer.toString(revs);
        char c[]=str.toCharArray();
        for(int i=str.length()-1;i>=0;i--){
            rv=rv+c[i];
        }
        out.println("Char Array:"+rv);



    }
}