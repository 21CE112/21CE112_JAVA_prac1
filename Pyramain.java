/*This program is created by Aryaan Rabara
**Aim:Display numbers in a pyramid pattern.
*/

public class Pyramain {
    public static void main(String[] args) {
        /*The logic is to run the main for loop 8 times to create 8 rows. 
        Inside It the first loop will print the required spaces after that the next loop will 
        print the required numbers which are 2^i,(i=0,1,2,3…)
        which will print the first rising part …the loop after that will print the rest part. */
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8-1-i;j++)
            {
                System.out.print("    ");
            }
            double b = 0;
            for(int a=8;a>8-1-i;a--)
            {
                System.out.print((int)Math.pow((double)2,b)+"    ");
                b++;
            }
            double d = i-1;
            for(int c=9;c<9+i;c++)
            {
                System.out.print((int)Math.pow((double)2,d)+"    ");
                d--;
            }
            System.out.println("\n");
        }
        System.out.println("This program is created by Aryaan Rabara");
    }
}
