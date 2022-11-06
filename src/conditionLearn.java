import java.util.Scanner;

public class conditionLearn {
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);
        System.out.println("Enter The value of A:");
        int a = nm.nextInt();
        System.out.println("Enter the value of B");
        int b = nm.nextInt();
        //if(age<18)
        /* int age= nm.nextInt();
        if(age%2==0)
        {
            System.out.println("Audult");
        }
        else
        {
            System.out.println("Kochi ");
        }*/
        if (a == b) {
            System.out.println("A is equal to B");
        } else if (a > b) {
            System.out.println("A is getter");
        } else
            System.out.println("A is lesser");
    }

}
