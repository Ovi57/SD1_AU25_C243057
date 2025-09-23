import java.util.Scanner;
public class SearchInArray {
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
        System.out.print("Enter a number to find in array: ");
        int target=input.nextInt();
        boolean found=false;
        for(int i=0;i<x;i++)
        {
            if(number[i]==target)
            {
                System.out.print(target +" found at position " +(i+1));
                found=true;
                break;
            }
        }
        if(!found)
        {
            System.out.print(target+" not found in array");
        }
        input.close();

    }
}
