
//Use two inner loops 1. spaces 2.Stars
// *****
//  ****
//   ***
//    **
//     *
public class Pattern8 {
    public static void main(String[] args) {
        for (int i = 5; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}