import java.util.Scanner;
public class AvgOfArray{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x=input.nextInt();
        System.out.print("Enter "+ x +" numbers: ");
        int[] numbers=new int[x];
        for(int i=0;i<x;i++)
        {
            numbers[i]=input.nextInt();
        }
        
        double sum=0;
        
        for(int i=0;i<x;i++)
        {
            sum+=numbers[i];
        }
        System.out.printf("Sum of the array is %.2f%n",sum);
        double average = sum / x;
        System.out.printf("Average of the array is  %.2f%n ",average);
        input.close();
    }
}