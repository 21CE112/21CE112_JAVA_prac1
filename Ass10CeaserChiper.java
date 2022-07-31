//This program is created by Aryaan Rabara 21CE112
import java.util.*;

public class Ass10CeaserChiper {
     // Encrypts text using a shift of s
     public static StringBuffer encrypt(String text, int s)
     {
          //Here we can use the concept of Stringbuffer in which the logic is if we take any character’s ASCII value and add the shift into it ,it will give the ASCII value of the required character but we want to continue the loop therefore we will subtract the ASCII value of “A” from it and then we will module that number with 26 because there are 26 total alphabets …and then simply add again 65(ASCII value of “A”) to get the Cipher.
   
         StringBuffer result= new StringBuffer();
   
         for (int i=0; i<text.length(); i++)
         {
             if (Character.isUpperCase(text.charAt(i)))
             {
                 char ch = (char)(((int)text.charAt(i) +
                                   s - 65) % 26 + 65);
                 result.append(ch);
             }
             else
             {
                                  // The same we can do for lowercase alphabets by subtracting the ASCII value of “a” from given character.

                 char ch = (char)(((int)text.charAt(i) +
                                   s - 97) % 26 + 97);
                 result.append(ch);
             }
         }
         return result;
     }
   
     // Driver code
     public static void main(String[] args)
     {
          //If we consider whole alphabet as 0 to 25 numbers and 26 again as the alphabet a and continue the loop …then cipher is if we take the alphabet a and want to do its fourth shift then consider a as 0 then 4th shift will return e and the same for all other alphabet.
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to encrypt: ");
         String text = sc.nextLine();
         System.out.printf("Enter the shift in the the string: ");
         int s = sc.nextInt();
         System.out.println("Text  : " + text);
         System.out.println("Shift : " + s);
         System.out.println("Cipher: " + encrypt(text, s));
         System.out.println("This program is created by Aryaan Rabara 21CE112");
     }
}
