import java.util.*;
import static java.lang.System.*;
public class duplicatefind {
    public static void main(String[] args){
        String a[]={"java","html","css","python","java","html"};
        for(int i=0;i<=a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    out.println("Duplicate elements are: \t"+a[i]);
                }
            }
        }
        String b[]={"java","html","css","python","java","html"};
        HashSet <String> la=new HashSet<>();
        boolean flag=false;
        for(String v:b){
            if(la.add(v)==false){
                out.println("Duplicate elements are: \t"+v);
                flag=true;
            }
        }
        if(flag==false)
        {
            out.println("Duplicate elements are not found\t");
        }    


    }
}
