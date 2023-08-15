import java.util.ArrayList;

public class  CountPrimeDigits{

    public static String[] transformCodes(int[] input1) {
        ArrayList<String> result = new ArrayList<>();
        for (int n : input1) {
            String answer = "";
            if (String.valueOf(n).length() == 6) {
                answer += "C";
            } else {
                answer += "W";
            }
            if (n == 0) {
                answer += "Z";
            } else if (n == 1) {
                answer += "O";
            } else if (isPrime(n)) {
                answer += "P";
            } else {
                answer += "N";
            }
            int sum = getSingleDigitSum(n);
            answer += sum;
            if (n % 2 == 0) {
                answer += n / 2;
            } else {
                answer += (n - 1) / 2;
            }
            result.add(answer);
        }
        return result.toArray(new String[0]);
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int getSingleDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        if (sum < 10) {
            return sum;
        } else {
            return getSingleDigitSum(sum);
        }
    }
    
    public static void main(String[] args) {
        // Test cases
        int[] input1 = {12};
        String[] output1 = transformCodes(input1);
        for (String code : output1) {
            System.out.println(code); // Output: WN36
        }

        int[] input2 = {123456, 1234567};
        String[] output2 = transformCodes(input2);
        for (String code : output2) {
            System.out.println(code);
        }
    }

}
