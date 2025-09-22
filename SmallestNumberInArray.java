import java.util.Scanner;
public class SmallestNumberInArray {
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int x=input.nextInt();
    System.out.print("Enter "+ x + " numbers: ");
    int[] numbers=new int[x];
    for(int i=0;i<x;i++)
    {
        numbers[i]=input.nextInt();
    }
    System.out.print("Smallest Number is: ");
    int smaller=numbers[0];
    for(int i=0;i<x;i++)
    {
        if(smaller>numbers[i])
        {
            smaller=numbers[i];
        }
    }
    System.out.print(smaller);
    input.close();

}  
}
