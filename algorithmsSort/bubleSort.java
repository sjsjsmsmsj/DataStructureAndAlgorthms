package algorithmsSort;
public class bubleSort {
    // Algorithm buble sort have complexility algorithm: O(n^2)
    public static void main(String[] args) {
        int nums[] = {6, 5, 2, 8, 9, 4};
        System.out.println("Before sorting:");
        for(int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Step buble sort: ");
        int steps = 0;
        for (int i = 0; i < nums.length; i ++) {

            // i in(nums.length - i - 1) is a mark sorted how many nums sorted
            for (int j = 0; j < nums.length - i - 1; j ++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
            steps ++;
            System.out.println();
            System.out.println("Total steps: " + steps);
            for (int k = 0; k < 6; k ++) {
                System.out.print(nums[k] + " ");
            }
        } 
        System.out.println("\nAfter sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
    
}
