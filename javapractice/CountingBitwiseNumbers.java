import java.util.*;
import static java.lang.System.*;
public class CountingBitwiseNumbers{
    public static void main(String[] args){
        Scanner a=new Scanner(in);
        int c=a.nextInt();
        int[] b=new int[c];
        int count1s=0;
        int count0s=0;
        for(int i=0;i<c;i++){
            b[i]=a.nextInt();
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<c;j++){
                int temp=j;
                int temp1=i;
                int result=temp1|temp;
                if(result==1){
                    count1s++;
                }
                else if(result==0){
                    count0s++;
                }
            }
        }
        out.println("count0s:"+count0s);
        out.println("count1s:"+count1s);

    }
}