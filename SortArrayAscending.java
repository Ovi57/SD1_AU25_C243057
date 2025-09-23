import java.util.Scanner;

public class SortArrayAscending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
         System.out.print("Sorted array (Ascending): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        input.close();
}

}
