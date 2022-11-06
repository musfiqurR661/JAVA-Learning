import java.util.Arrays;

public class arraylearn {
    public static void main(String[] args) {
        int age = 30;
        int physics = 98;
        int chem = 100;
        int bio = 90;

        int[] marks = new int[3];
//        marks[0]=98;
//        marks[1]=100;
//        marks[2]=90;
        //len gth
        System.out.println(marks.length);
        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

    }
}
