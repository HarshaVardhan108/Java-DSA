import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++ ) {
			arr[i] = scanner.nextInt();
		}

		
		int sum = 0;
		for (int i = 0; i < arr.length ; i++) {
			sum += arr[i];
		}

		//Method- 1 to print Arrays
		// System.out.print("Array: [");
		// for (int i = 0; i < arr.length ; i++) {
		// 	System.out.print(arr[i]);
		// 	if (i == arr.length-1){
		// 		System.out.println("]");
		// 		break;
		// 	}
		// 	System.out.print(",");
		// }

		//Method - 2 to print Arrays in  Brackets
		//Using predefined method Arrays.toString 
		System.out.println("Arrays: " + Arrays.toString(arr));

		System.out.println("\nSum: " +sum);
		scanner.close();
	}
}