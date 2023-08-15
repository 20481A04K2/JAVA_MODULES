import java.util.*;
import static java.lang.System.*;
public class maxnumberarray {
    public static void main(String args[]){
        int a[]={20,70,100,60,70,90};
        int max=a[0];
        int min=a[0];
        for(int i=1;i<=a.length-1;i++){
            if(a[i]>max){
                max=a[i];
            }
            else if(a[i]<min){
                min=a[i];
            }
        }
        out.println(max+"\t"+min);
    }
}
