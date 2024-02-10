package algorithmsSort;

public class mergeSort {
    public static void main(String[] args) {
        
        int arr[] = {3, 5, 1, 4, 6, 2};
        for (int n: arr) {
            System.out.print(n + " ");
        }
        System.out.println();
        mergeSortV1(arr, 0, arr.length - 1);
        System.out.println("After sorting");
        for (int n: arr) {
            System.out.print(n + " ");
        }
    }

    private static void mergeSortV1(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSortV1(arr, l, mid);
            mergeSortV1(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int L[] = new int[n1 + 1];
        int R[] = new int[n2 + 1];
        for (int i = 0; i < n1; i ++) {
            L[i] = arr[i + l];
        }
        for (int i = 0; i < n2; i ++) {
            R[i] = arr[mid + 1 + i];
        }
        L[n1] = R[n2] = Integer.MAX_VALUE;
        int i = 0, j = 0; 

        for (int k = l; k <= r; k ++) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i ++;
            } else {
                arr[k] = R[j];
                j ++;
            }
        }
    }
}
