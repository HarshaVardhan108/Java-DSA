
public class Pattern14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 2; j++) {
                if (i==2||i==4||j==2)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}