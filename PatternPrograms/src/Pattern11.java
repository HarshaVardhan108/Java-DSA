//    *
//   * *
//  * * *
// * * * *
//* * * * *
// * * * *
//  * * *
//   * *
//    *
public class Pattern11 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 2; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <=5; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 6-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}