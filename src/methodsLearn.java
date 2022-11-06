public class methodsLearn {
    public static void printjava() {
        System.out.println("HI JAVA");
    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);

    }

    public static void main(String[] args) {
        //methods

        for (int i = 0; i < 3; i++) {
            printjava();
        }
        for (int i = 0; i < 3; i++) {
            printName("TUHIN");
        }
        for (int i = 0; i < 3; i++) {
            printSum(66, 3);
        }
    }
}
