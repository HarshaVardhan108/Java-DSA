package ExceptionHandling;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Program started");
        try {
            aplha();
        } catch (RuntimeException e) {
            System.out.println("Exception occured");
        }
        System.out.println("Program ended");
    }

    public static void aplha() {
        System.out.println("Alpha Program started");
        beta();
        System.out.println("Alpha Program ended");
    }

    public static void beta() {
        System.out.println("Beta Program started");
        gama();
        System.out.println("Beta Program ended");
    }

    public static void gama() {
        System.out.println("Gamma Program started");
        int a = 10;
        int b = 0;
        System.out.println("a/b = " + a/b);
        System.out.println("Gamma Program ended");
    }
}