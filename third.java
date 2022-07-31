//This program is created by Aryaan Rabara 21CE112
//Aim:Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the
//array somewhere.
//array123([1, 1, 2, 3, 1]) → true
//array123([1, 1, 2, 4, 1]) → false
//array123([1, 1, 2, 1, 2, 3]) → true
import java.util.Scanner;
public class third {
    
    public static void array123(int arr[])
    {
        int i;
        /*And if the number at second last index or last index is 1 then break the loop because when it will try to search for the number 3 and 2 respectively
 in this cases the array will go out of bound and the program will throw an error */

        for(i=0;i<arr.length;i++)
        {
            if(i==arr.length-2||i==arr.length-1)
            {
                if(arr[i]==1)
                {
                    System.out.println(false);
                    break;
                }
            }
            if(arr[i]==1)
            {
                if(arr[i+1]==2)
                {
                    if(arr[i+2]==3)
                    {
                        System.out.println(true);
                        break;
                    }
                }
            }
        }
        if(i==arr.length)
        {
            System.out.println(false);
            
        }
       
    }
    public static void main(String[] args) {
        /*The logic is to traverse through the array and first find the number 1 if it is found then check if following numbers are 2 and 3(respectively) or not .
        .if it is then return true otherwise find for another 1. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:-");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int j=0;j<n;j++)
        {
            arr[j] = sc.nextInt();
        }
        array123(arr);
        System.out.println("This program is created by Aryaan Rabara 21CE112");
    }
}
