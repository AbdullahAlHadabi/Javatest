public class Main {

    static int add(int a, int b) {
        return a + b;
    }

    static void greet(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        greet("Abdullah");
        System.out.println(add(5, 7));
    }
}