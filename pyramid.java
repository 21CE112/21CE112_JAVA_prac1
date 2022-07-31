import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = n;
    int y=2,x,b;
    for(int i=0;i<n;i++)
    {
        for(int j=1;j!=a-1;j++)
        {
            System.out.print(" ");
        }
        b = ((n*2)- 1)-(2*(a-1));
       System.out.println(b);
        for(int k=0;k<b;k++)
        {
           if(k<=b/2)
           {
            System.out.print(Math.pow(2, k)+" ");
           }
           else
           {
            x = k-y;
            System.out.println(x);
            System.out.print(Math.pow(2, x)+" ");
            y++;
           }

        }
        for(int l=1;l!=a-1;l++)
        {
            System.out.print(" ");
        }
        a--;
        System.out.println();
    }
}
}
