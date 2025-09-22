import java.util.Scanner;
public class PrintAndStoreArray {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x=input.nextInt();
        int[] Numbers=new int[x];
        System.out.print("Enter " + x +" Numbers: ");
        for(int i=0;i<x;i++)
        {
            Numbers[i]=input.nextInt();
        }
        System.out.print("Stored Numbers are: ");
        for(int i=0;i<x;i++)
        {
            System.out.print(Numbers[i]+" ");
        }
        input.close();
    }
} 
