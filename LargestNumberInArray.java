import java.util.Scanner;
public class LargestNumberInArray {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x=input.nextInt();
        int[] Numbers=new int[x];
        System.out.print("Enter "+ x +" numbers: ");
        for(int i=0;i<x;i++)
        {
            Numbers[i]=input.nextInt();
        }
        System.out.print("Largest Number is: ");
        int large=0;
        for(int i=0;i<x;i++)
        {
           if(Numbers[i]>large)
           {
            large=Numbers[i];
           }
        }
        System.out.print(large);
        input.close();
    }
}
