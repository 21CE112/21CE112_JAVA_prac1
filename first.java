//This program is created Aryaan Rabara 21CE112
//Aim:Given a string, return a string made of the first 2 chars (if present), however include
//first char only if it is 'o' and include the second only if it is 'z', so "ozymandias"
//yields "oz".
//startOz("ozymandias") → "oz"
//startOz("bzoo") → "z"
//startOz("oxx") → "o"
import java.util.Scanner;
public class first {
   
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String:");
    String name = sc.next();
    startOz(name);
    sc.close();
}
/*Given a String in which it has been asked to check whether the first character is o 
or not and the second character is z or not or both in the same string.*/
    public static void startOz(String name)
    {
        char ch = name.charAt(0);
        char ch2 = name.charAt(1);
         /*The logic is to traverse through the array and check whether the mentioned condition is there or not.
    If the characters of array are at the required index then print them otherwise skip */
        if(ch == 'o')
        {
            System.out.print("o");
        }
        if(ch2 == 'z')
        {
            System.out.println("z");
        }
        System.out.println("This program is created Aryaan Rabara 21CE112");
    }
}
