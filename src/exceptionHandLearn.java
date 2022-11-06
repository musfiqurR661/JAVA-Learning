public class exceptionHandLearn {
    public static void main(String[] args) {
        //EXCEPTION HANDLING  TRY - CATCH
        int[] marks = {97, 98, 95};
        try {
            System.out.println(marks[7]);
        } catch (Exception exceptation) {
            //do something then like this
            System.out.println(marks[2]);

        }

        System.out.println("The name is TUHIN");
    }
}
