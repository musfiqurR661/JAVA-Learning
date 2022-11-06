import java.util.Scanner;

public class operatorlearn {
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);
        System.out.println("Enter the Value of A:");
        double a = nm.nextDouble();
        System.out.println("Enter the value of B:");
        double b = nm.nextDouble();
        double sum = a + b;
        System.out.println(sum);
        double sub = a - b;
        System.out.println(sub);
        double multi = a * b;
        System.out.println(multi);
        double div = a / b;
        System.out.println(div);
        double modul = a % b;
        System.out.println(modul);
        //unary operator
        int num = 1;
        System.out.println(num++);
        System.out.println(--num);


    }
}
