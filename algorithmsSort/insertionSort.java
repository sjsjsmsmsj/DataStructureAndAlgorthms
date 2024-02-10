package algorithmsSort;

public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {5, 6, 2, 3, 1};
        System.out.println("Total steps of insertion sort: ");
        int steps = 0;
        for (int i = 1; i < arr.length; i ++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j --;
            }
            arr[j + 1] = key;
            steps ++;
            System.out.print("\nStep(s): " + steps);
            System.out.println();
            for(int num: arr) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println("After sorted: ");
        for(int num: arr) {
            System.out.print(num + " ");
        }
    }
}
