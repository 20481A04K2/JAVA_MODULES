import java.lang.*;
import static java.lang.System.*;
import java.util.*;
public class sortingarray{
    public static void main(String args[]){
        int a[]={20,2,13,23,12};
        Arrays.sort(a);
        for(int v:a){
            out.println(v);
        }out.println(Arrays.toString(a));//string representation of array
        //using logic
        int b[]={4,2,1,5,3,32,32,23,23};
        int n=b.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(b[j]>b[j+1]){
                    int temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }
        out.println("logic"+Arrays.toString(b));
        int c[]={4,2,1,5,3,32,32,23,23};
        //sing Arrays,parallelSort
        Arrays.parallelSort(c);
        out.println("parallelSort:"+ Arrays.toString(c));
        Integer x[]={4,2,1,5,3,32,32,23,23};//Collections.reverseOrder() doesnot accept primitive datatypes so,we write inplace of int as Integer
        //to print descending order
        Arrays.sort(x,Collections.reverseOrder());
        out.println("reverse order"+Arrays.toString(x));

    }
}