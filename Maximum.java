import java.util.Scanner;
public class Maximum {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Three Number: ");
        float x=input.nextFloat();
        float y=input.nextFloat();
        float z=input.nextFloat();
        if(x>y && x>z)
        {System.out.println("Maximum Number is "+x);}
        else if(y>x && y>z)
        {System.out.println("Maximum Number is "+y);}
        else if(z>x && z>y)
        {System.out.println("Maximum Number is "+z);}
        else
        {System.out.println("All numbers are equal");}
        input.close();


        
    }
}
