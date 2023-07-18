package problems;

public class Q5 {

	 public static int nthUglyNumber(int n) {
	        int[] uglyNumbers = new int[n];
	        uglyNumbers[0] = 1;

	        int nextMultipleOf2 = 2;
	        int nextMultipleOf3 = 3;
	        int nextMultipleOf5 = 5;

	        int index2 = 0;
	        int index3 = 0;
	        int index5 = 0;

	        for (int i = 1; i < n; i++) {
	            int nextUgly = Math.min(nextMultipleOf2, Math.min(nextMultipleOf3, nextMultipleOf5));
	            uglyNumbers[i] = nextUgly;

	            if (nextUgly == nextMultipleOf2) {
	                index2++;
	                nextMultipleOf2 = uglyNumbers[index2] * 2;
	            }

	            if (nextUgly == nextMultipleOf3) {
	                index3++;
	                nextMultipleOf3 = uglyNumbers[index3] * 3;
	            }

	            if (nextUgly == nextMultipleOf5) {
	                index5++;
	                nextMultipleOf5 = uglyNumbers[index5] * 5;
	            }
	        }

	        return uglyNumbers[n - 1];
	    }

	    public static void main(String[] args) {
	        int n = 10;
	        int result = nthUglyNumber(n);
	        System.out.println("Output: " + result); // Output: 12
	    }

}
