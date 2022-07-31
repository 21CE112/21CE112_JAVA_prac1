//This program is created by Aryaan Rabara 21CE112
//Aim:The problem is to check whether a given Sudoku solution is correct.
import java.util.Scanner;
public class sudoku {
    static int n=0;
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //The logic is …first take 9x9 array for Sudoku elements..
    String Sudoku[][] = new String[9][9];
    System.out.println("Enter the input:");
    for(int i=0;i<9;i++)
    {
        // System.out.println("row"+i+1);
        for(int j=0;j<9;j++)
        {
            // System.out.print(++n);

            Sudoku[i][j] = sc.next();
            // ++n;
        }
        System.out.println();
    }
    for(int i=0;i<9;i++)
    {
        for(int j=0;j<9;j++)
        {
            System.out.print("  "+Sudoku[i][j]);
        }
        System.out.println();
    }
    //then compare each element with its corresponding row and column and increment a variable n each time the loop starts. If all the rows are properly arranged then the value of n will be 729 but it will also compare the element with itself so we have to subtract 81 from it so if the same element is found decrement the variable n which will give 648 
    for(int i=0;i<9;i++)
    {
        for(int j=0;j<9;j++)
        {

            for(int k=0;k<9;k++)
            {
                ++n;
                if(Sudoku[j][i].equals(Sudoku[j][k]))
                {
                    // System.out.println("manji");
                    n--;
                    // break;
                }
            }
        }
    }
    //if it is true … and the same for columns so final value of n will be 1296 if Sudoku is true and will print yes…otherwise no…
    for(int i=0;i<9;i++)
    {
    for(int j=0;j<9;j++)
        {
        
            for(int k=0;k<9;k++)
            {
                ++n;
                if(Sudoku[i][j].equals(Sudoku[k][j]))
                {
                    
                    n--;
                    
                }
            }
        }
    }
    
        if(n==1296)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
        System.out.println("This program is created by Aryaan Rabara 21CE112");
}
}