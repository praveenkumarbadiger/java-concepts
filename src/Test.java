import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Test {

	/*
	 * public static void main(String[] args) { float f[] = new float[5]; Object obj
	 * = f; System.out.println();
	 * 
	 * 
	 * //System.out.println((1<<2<<3));
	 * 
	 * int i = 0; int j = 0; j = i++;
	 * 
	 * System.out.println("i = "+i); System.out.println("j = "+j);
	 * 
	 * 
	 * 
	 * }
	 */

	static void sum_up_recursive(ArrayList<Integer> numbers, int target, ArrayList<Integer> partial) {
		int s = 0;
		for (int x : partial)
			s += x;
		if (s == target)
			System.out.println("sum(" + Arrays.toString(partial.toArray()) + ")=" + target);
		if (s >= target)
			return;
		for (int i = 0; i < numbers.size(); i++) {
			ArrayList<Integer> remaining = new ArrayList<Integer>();
			int n = numbers.get(i);
			for (int j = i + 1; j < numbers.size(); j++)
				remaining.add(numbers.get(j));
			ArrayList<Integer> partial_rec = new ArrayList<Integer>(partial);
			partial_rec.add(n);
			sum_up_recursive(remaining, target, partial_rec);
		}
	}

	static void sum_up(ArrayList<Integer> numbers, int target) {
		sum_up_recursive(numbers, target, new ArrayList<Integer>());
	}

	public static void main(String args[]) {
		Integer[] numbers = { 3, 9, 8, 4, 5, 7, 10 , 2, 5, 7};
		int target = 15;
		sum_up(new ArrayList<Integer>(Arrays.asList(numbers)), target);
	}

}