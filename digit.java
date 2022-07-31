//This program is created by Aryaan Rabara 21CE112
//Aim:Given two non-negative int values, return true if they have the same last digit, such
//as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 %
//10 is 7.
//lastDigit(7, 17) → true
//lastDigit(6, 17) → false
//lastDigit(3, 113) → true
import java.util.*;
public class digit {
    public static boolean lastdigit(int n1,int n2)
    {
        /*The logic is to module the number by 10 which will give the last digit of a number and then compare both 
        the last digits if they are same then the function will return true otherwise false */
        n1 = n1 % 10;
        n2 = n2 % 10;
        if(n1==n2)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        /*Given to numbers in which it has been asked to check whether the last digit of both numbers are same or not. */
        System.out.println("Enter the first number:-");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter the second number:-");
        int n2 = sc.nextInt();
        System.out.println(lastdigit(n1, n2));
        sc.close();
        System.out.println("This program is created by Aryaan Rabara 21CE112");
    }
}
