package algorithmsSort;

public class selectionSort {
    public static void main(String[] args) {
        int nums[] = {6, 5, 2, 8, 9, 4};
        System.out.println("Before sorting:");
        for(int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Step selection sort:\n");
        int steps = 0;

        int minIndex = -1;
        for (int i = 0; i < nums.length - 1; i ++) {
            minIndex = i;
            for (int j = i + 1; j <  nums.length; j ++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            steps ++;
            int tmp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = tmp; 
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("Steps for implement selection sort: " + steps);
        System.out.println("\nAfter sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
