import java.util.Scanner;

public class learnSwitch {
    public static void main(String[] args) {
        Scanner nm= new Scanner(System.in);
        System.out.println("Enter number:");
        int number= nm.nextInt();
        switch (number)
        {
            case 1:
                System.out.println("Kemon acho");
                break;
            case 2:
                System.out.println("Valo nai");
                break;
            case 3:
                System.out.println("OH! Accha");
                break;
            default:
                    System.out.println("Tumi valoi.Hahaha");

        }

    }
}
