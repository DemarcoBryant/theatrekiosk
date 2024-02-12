//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        int age = 0;
        int DRINKING_AGE = 21;
        System.out.println("Enter your age:");
        age = in.nextInt();
        in.nextLine();
        if( age >= DRINKING_AGE)
        {
            System.out.println("You get a wristband. Drink responsibly!");
        }
    }
}