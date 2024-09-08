import java.util.Scanner;

public class StringFunOODriver
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a message: ");
        String msg = keyboard.nextLine();
        
        StringFunObject sfo = new StringFunObject();
        sfo.setMessage(msg);
        sfo.reverse();
        sfo.camelCase();
        sfo.cuthalf();
        
        System.out.println(sfo.getMessage());
    }
}