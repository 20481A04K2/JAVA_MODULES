import java.util.Scanner;
import java.util.*;
import static java.lang.System.*;

public class CheckNumberN {

    public static long GetNewNum(long[] arr) {
        int n = arr.length;

        // Initialize an array to store the count of 0s and 1s at each position
        int[] count0s = new int[32];
        int[] count1s = new int[32];

        // Calculate the counts of 0s and 1s at each position
        for (int i = 0; i < n; i++) {
            long num=arr[i];
            while(num>=0){
                if(arr[i]%2==0){
                    count0s[i]++;
                }
                else if(arr[i]%2!=0){
                    count1s[i]++;
                }
                arr[i]/=2;
            }

        }
        long newNum = 0;
        for (int i = 0; i < 32; i++) {
            if (count1s[i] > count0s[i]) {
                newNum |= (1L << i);
            }
        }

        return newNum;

       
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        scanner.close();

        long result = GetNewNum(arr);
        System.out.println(result);
    }
}
