public class MethodOverLoad {
    public static void name(String[] args) {
        // method overloading
        display(7);
        display(7, 10);
    }

    public static void display(int a) {
        System.out.println(a);
    }

    public static void display(int a, int b) {
        System.out.print("A = " + a + " B = " + b);
    }
}