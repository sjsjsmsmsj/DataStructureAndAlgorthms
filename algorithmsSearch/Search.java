package algorithmsSearch;
public class Search {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int target = 0;
        int result1 = linearSearch(nums, target);
        int result2 = binarySearchV2(nums, target, 0, nums.length - 1);
        System.out.println("binary search v2: " + result2);
    }


    public static int linearSearch(int[] nums, int target) {
        int step = 0;
        for ( int i = 0; i < nums.length; i ++ ) {
            step ++;
            if ( nums[i] == target ) {
                System.out.println("Step taken by Linear Search: " + step);
                return i;
                
            }
        }
        System.out.println("Step taken by Linear Search: " + step);
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        int steps = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            steps ++;
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                System.out.println("Step taken binary Search : " + steps);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Step taken binary Search : " + steps);

        return -1;
    }

    public static int binarySearchV2(int[] nums, int target, int left, int right) {
        if ( left <= right ) {

            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return binarySearchV2(nums, target, mid + 1, right);
            } else 
                return binarySearchV2(nums, target, left, mid - 1);
                
        }
        return -1;
    }
}