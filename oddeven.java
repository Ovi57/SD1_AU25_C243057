import java.util.Scanner;


public class oddeven {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x=input.nextInt();
        if( x%2==0)
        {System.out.println("Even Number");}
        else
        {System.out.println("Odd Number");}
            input.close();
    }
}
