//This program is created by Aryaan Rabara 21CE112
//Given an array of strings, return a new array without the strings that are equal to
//the target string. One approach is to count the occurrences of the target string, make
//a new array of the correct length, and then copy over the correct strings.
//wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
//wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
//wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
// import java.io.Flushable;
import java.util.Scanner;
public class sixth{
    public static void wordsWithout(String name1[],String name2[])
    {
        /*The logic is to check if the targeted String is present in the given String or not.
         If it is not there then only print the Strings present inside given String otherwise skip. */
        System.out.println("The new array without the word "+name2[0]+" is :-");
        for(int i=0;i<name1.length;i++)
        {
            if(!(name1[i].equals(name2[0])))
            {
                System.out.print(name1[i]);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of chara:-");
        int n = sc.nextInt();
        
        
        String name1[] = new String[n];
        String name2[] = new String[1];
       
        System.out.println("Enter the string:-");
        for (int i = 0; i < n; i++) {
        
            name1[i] = sc.next();
        }
        System.out.println("Enter:-");
        name2[0] = sc.next();
        wordsWithout(name1, name2);
        sc.close();
        System.out.println("This program is created by Aryaan Rabara 21CE112");
    }
}