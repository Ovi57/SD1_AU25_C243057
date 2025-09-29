import java.util.Scanner;

public class SecretMessageReversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String line = input.nextLine();   
        String[] words = line.split(" ");
        System.out.print("After reverse: ");
        for (String word : words) {
            
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" "); 
        }
        
    input.close();
    }
}
