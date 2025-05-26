package ExceptionHandling;

public class Finally {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            System.out.println(a/b);
        } catch(Exception e) {
            System.out.println("Exception occured");
        } finally {
            System.out.println("Program ended");
        }
    }
}