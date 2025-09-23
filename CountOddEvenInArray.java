import java.util.Scanner;
public class CountOddEvenInArray{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x=input.nextInt();
        System.out.print("Enter "+ x +" numbers: ");
        int[] number=new int[x];
        for(int i=0;i<x;i++)
        {
            number[i]=input.nextInt();
        }
        int oddcount=0;
        int evencount=0;
        for(int i=0;i<x;i++)
        {
            if(number[i]%2==0)
            {
                evencount++;
            }
            else
            {
                oddcount++;
            }
        }
        System.out.println("Total Odd Numbers: "+oddcount);
        System.out.println("Total Even Numbers: "+evencount);
       input.close();
    }
     
}