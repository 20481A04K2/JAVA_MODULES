import java.util.*;
import static java.lang.System.*;
class Fraction{
    private int numerator;
    private int denominator;
    public Fraction(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public void simplify(){
        int commonDivisor=gcd(numerator,denominator);
        numerator /= commonDivisor;
        denominator /= commonDivisor;

    }
    public void add(Fraction other){
        int newNum=numerator*other.denominator+denominator*other.numerator;
        int newDen=denominator*other.denominator;
        numerator=newNum;
        denominator=newDen;
    }
    public void multiply(Fraction other){
        int newNumerator=numerator*other.numerator;
        int newDenominator=denominator*other.denominator;
        numerator=newNumerator;
        denominator=newDenominator;
    }
    public void print(){
        out.println(numerator+"/"+denominator);
    }
}
public class FractionGcd {
    public static void main(String args[]){
        Scanner a=new Scanner(in);
        int numerator=a.nextInt();
        int denominator=a.nextInt();
        int queries=a.nextInt();
        Fraction f1=new Fraction(numerator,denominator);
        for(int i=0;i<queries;i++){
            int query=a.nextInt();
            int numerator1=a.nextInt();
            int denominator1=a.nextInt();
            Fraction f2=new Fraction(numerator1,denominator1);
            if(query==1){
                f1.add(f2);
            }
            else if(query==2){
                f1.multiply(f2);
            }
        }
        f1.simplify();
        f1.print();
    }
}
