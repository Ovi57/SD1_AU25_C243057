import java.util.Scanner;
public class Factorial {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x=input.nextInt();
        long fact=1;
        for(int i=1;i<=x;i++)
        {
            fact *=i;
        }
        System.out.println("Factorial of " + x + " is : " + fact);
        input.close();
    }
    
}
