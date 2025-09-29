import java.util.Scanner;
public class UniqueJerseyNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of players: ");
        int N = input.nextInt(); 
        System.out.print("The jersey numbers: ");      
        int[] arr = new int[N];      
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("The count of unique jersey numbers : ");
        int uniqueCount = 0;
        for (int i = 0; i < N; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueCount++;
            }
        }
        
        System.out.println(uniqueCount);
        input.close();
    }
}
