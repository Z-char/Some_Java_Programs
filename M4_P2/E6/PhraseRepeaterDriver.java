import java.util.Scanner;

public class PhraseRepeaterDriver 
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a message: ");
        String msg = keyboard.nextLine();
        System.out.print("Number of times: ");
        int n = keyboard.nextInt();
        
        PhraseRepeater pr = new PhraseRepeater();
        pr.setValues(msg, n);
        // if you exchange two parameters it did not work as there is no implicit conversion for int to be string.
        System.out.println(pr.getRepeatedPhrase());
    }
}
