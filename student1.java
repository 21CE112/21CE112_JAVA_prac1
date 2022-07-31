//This program is created by Aryaan Rabara 21CE112
//Aim: The problem is to write a program that will grade multiple-choice tests. Assume there are eight
//students and ten questions, and the answers are stored in a two-dimensional array. Each row records a
//student’s answers to the questions, as shown in the following array.
//Students’ Answers to the Questions:
//          0 1 2 3 4 5 6 7 8 9
//Student 0 A B A C C D E E A D
//Student 1 D B A B C A E E A D
//Student 2 E D D A C B E E A D
//Student 3 C B A E D C E E A D
//Student 4 A B D C C D E E A D
//Student 5 B B E C C D E E A D
//Student 6 B B A C C D E E A D
//Student 7 E B E C C D E E A D
//The key is stored in a one-dimensional array:
//Key to the Questions:
//0 1 2 3 4 5 6 7 8 9
//Key D B D C C D A E A D

import java.util.*;
class Student
{
   String option[][] = new String[8][10];
   int marks[] = new int[8];
   String key[] = {"D","B","D","C","C","D","A","E","A","D"}; 
   Scanner sc = new Scanner(System.in);
   public void getData()
   {
    //This function will take input of Options selected by Students.
        for(int i=0;i<8;i++)
        {
            System.out.println("Enter the marks for "+(i+1)+" th Student:-");
            for(int j=0;j<10;j++)
            {
                System.out.println("Enter the answer of "+(j+1)+" th question:-");
                option[i][j] = sc.next();
            }
        }
   }
   public void getMarks()
   {
    //The logic for getting marks is creating array of type int with for 8 student
    //first it will compare the answer of 1st student for 1st question , 
    //if it is true then increment the 0th index which is for the 1st student and after comparing each answer 
    //we will get total marks for 1st student and the same for rest students.
    for(int i=0;i<8;i++)
       {
            for(int j=0;j<10;j++)
            {
                if(option[i][j].equals(key[j]))
                {
                    marks[i]++;
                }
            }
       }
       for(int i=0;i<8;i++)
       {
            System.out.println("The marks of Student "+(i+1)+" is:- "+(marks[i]));
       }
   }
}
 
public class student1 {
    public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
       Student s = new Student();
       s.getData();
       s.getMarks();
        sc.close();
        System.out.println("This program is created by Aryaan Rabara 21CE112");
    }
}
