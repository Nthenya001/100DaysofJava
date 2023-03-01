package AreSame;

import java.util.Arrays;

public class AreSame {
	public static boolean comp(int[] a, int[] b) {
		if(a == null || b == null || a.length != b.length) {
			return false;
		}
		
		// Square each element in a and sort both arrays
		int[] squaredA = Arrays.stream(a).map(i -> i * i).sorted().toArray();
		int[] sortedB = Arrays.stream(b).sorted().toArray();
		
//		Compare sorted arrays
		return Arrays.equals(squaredA, sortedB);
	}
}
