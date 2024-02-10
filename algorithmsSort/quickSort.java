package algorithmsSort;
public class quickSort {
    public static void main(String[] args) {
        int arr[] = {5, 6, 2, 3, 1};
        System.out.println("Before sort: ");
        for(int num: arr) {
            System.out.print(num + " ");
        }
        quickSortV1(arr, 0, arr.length - 1);
        System.out.println("\n\nTotal have steps: " + steps);
        System.out.println();
        System.out.println("After sorted: ");
        for(int num: arr) {
            System.out.print(num + " ");
        }
    }

    private static int steps = 0;

    public static void quickSortV1(int[] arr, int low, int high) {
        if (low < high) {
            steps ++;
            int pi = partition(arr, low, high);
            quickSortV1(arr, low, pi - 1);
            quickSortV1(arr, pi + 1, high);
        }
    }
    
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j ++) {
            if (arr[j] < pivot) {
                i ++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        int tmp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = tmp;
        return i + 1;
    }
}