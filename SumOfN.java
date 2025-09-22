import java.util.Scanner;
public class SumOfN {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x=input.nextInt();
        int sum=0;
        for(int i=1;i<=x;i++)
        {
            sum += i;
        }
        System.out.println("Sum of 1 to "+x+"th "+"number is : "+sum);
        input.close();
    }
    
}
