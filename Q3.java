package problems;

public class Q3 {

	public static int findMajorityElement(int[] nums) {
        int majorityElement = nums[0]; 
        int count = 1; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majorityElement) {
                count++;
            } else {
                count--; 
                if (count == 0) {
                  
                    majorityElement = nums[i];
                    count = 1;
                }
            }
        }

        return majorityElement;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int result = findMajorityElement(nums);
        System.out.println("Output: " + result);
    }

}
