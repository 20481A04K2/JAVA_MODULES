import java.util.*;
import static java.lang.System.*;
public class BasicLearning1 {
    public static void main(String[] args){
        int count=0,count1=0;
        int[] list={1,2,3,4,5,6,7,8,9,10};
        for(int i =0;i<list.length;i++){
            out.println("list i:"+"counti:"+count1+"=i:"+list[i]);
            count1++;
            for(int j=i+1;j<list.length;j++){
                out.println("list j:"+"countj:"+count+"=j:"+list[j]);
                count++;
            }
        }
    }
}
