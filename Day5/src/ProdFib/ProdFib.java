package ProdFib;

public class ProdFib {
	public static long[] productFib(long prod) {
	    // your code
//	 		return null;
	    long prev = 0, curr = 1;
	    while (prev * curr < prod) {
	        long temp = curr;
	        curr = prev + curr;
	        prev = temp;
	    }
	    return new long[] {prev, curr, prev * curr == prod ? 1 : 0};
	   }
	}

// We start with two variables prev and curr initialized to the first two Fibonacci numbers 0 and 1. We keep computing the next Fibonacci 
// number by adding the previous two (prev and curr) until the product of the current and next Fibonacci numbers (prev * curr) is greater than or equal to the input prod. 
// If the product is equal to prod, we return an array with prev, curr, and 1 indicating that we found two consecutive Fibonacci numbers whose product is equal to prod. 
// Otherwise, we return an array with prev, curr, and 0 indicating that we did not find two consecutive Fibonacci numbers whose product is equal to prod.
