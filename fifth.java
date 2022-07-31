//This program is created by Aryaan Rabara 21CE112
//Aim:Given 2 strings, a and b, return the number of the positions where they contain the
//same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa",
//and "az" substrings appear in the same place in both strings.
//stringMatch("xxcaazz", "xxbaaz") → 3
//stringMatch("abc", "abc") → 2
//stringMatch("abc", "axc") → 0
import java.util.Scanner;
public class fifth {
    public static void main(String[] args) {
        /*to traverse through both the array and check if the character at same index of both array is same or
         not if it is same then check if the character after that index is same or not if
         it is same then increment the count and print the count. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 :");
        String name1 = sc.nextLine();
        System.out.println("Enter String 2 :");
        String name2 = sc.nextLine();
        stringMatch(name1, name2);
        sc.close();
    }
    public static void stringMatch(String name1 , String name2)
    {
      /*  The loop will run till the length of smaller String.
         If it reaches at the last index of array the  break the loop otherwise it will go out of bound.*/
        int len,count=0;
        if(name1.length()<name2.length())
        {
            len = name1.length();
        }
        else
        len = name2.length();
        for(int i=0;i<len;i++)
        {
            if(i==len-1)
            {
                break;
            }
            if(name1.charAt(i) == name2.charAt(i))
            {
                if(name1.charAt(i+1) == name2.charAt(i+1))
                {
                    count++;
                }
            }
        }

        System.out.println(count);
        System.out.println("This program is created by Aryaan Rabara 21CE112");

    }
}
