package FunctionsInJava;

import java.math.BigInteger;
import java.util.Scanner;

public class Functions {
    public static int sumOfTwoNumbers(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static int multiplicationOfTwoNum(int a, int b){
        int mul = a*b;
        return mul;
    }
    public static int divisionOfTwoNum(int a, int b){
        int div = a / b;
        return div;
    }

    public static int subOfTwoNum(int a, int b){
        int sub = a - b;
        return sub;
    }

    public static double powerOfGivenNum(int a, int b){
        double power = Math.pow(a, b);
        return power;
    }

    public static BigInteger factorialOfGivenNum(int a){
       BigInteger factorial = BigInteger.ONE;
        for (int i = a ; i >= 1 ; i--){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int sum = sumOfTwoNumbers(a, b);
    System.out.println("sum of given numbers is = "+sum);

    int mul = multiplicationOfTwoNum(a,b);
    System.out.println("Multiplication of given numbers is = "+ mul);

    int div = divisionOfTwoNum(a, b);
    System.out.println("division of given numbers is = "+ div);

    int sub = subOfTwoNum(a, b);
    System.out.println("difference btw to numbers is = "+ sub);

    double power = powerOfGivenNum(a, b);
    System.out.println("power of given numbers is = "+power);

    BigInteger factorial = factorialOfGivenNum(a);
    System.out.println("Factorial of Given number is = "+factorial);
    }
}