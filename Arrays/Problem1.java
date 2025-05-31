import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list1 = new ArrayList<Integer>();

		while(sc.hasNextInt()) {
			list1.add(sc.nextInt());
		}

		ArrayList<Integer> list2 = new ArrayList<Integer>();

		while(sc.hasNextInt()) {
			list2.add(sc.nextInt());
		}

		findCommon(list1, list2);

	}

	public static void findCommon(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for(int i: list1) {
			set1.add(i);
		}
		for(int i: list2) {
			set2.add(i);
		}

		set1.retainAll(set2);
		System.out.println(set1);
	}
}