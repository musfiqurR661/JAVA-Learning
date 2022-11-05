package JAVA_string;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        //declare ,print String in java
        String s1 = "Musfiqur";
        String s2 = "Noman";
        String s3 = "is a programmer";

        System.out.println(s1 + " and " + s2 + " " + s3);
        System.out.println(s2 + " " + s3);

        //string from user
        Scanner zz = new Scanner(System.in);

        System.out.println("Enter Your name:");
        String name = zz.nextLine();
        System.out.println("Enter Your Age:");
        int age = zz.nextInt();
        System.out.println("Enter your id:");
        zz.nextLine();
        String id = zz.nextLine();

        System.out.println(name);
        System.out.println(age);
        System.out.println(id);

        //string length
        System.out.println(name.length());
        //System.out.println(age.length());
        System.out.println(id.length());

        //join Tw0 string

        System.out.println(s1.concat(s3));
        System.out.println();

    }

}
