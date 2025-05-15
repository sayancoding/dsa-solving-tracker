public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 64, 25, 12, 22, 11 };
        mergeSort(arr, 0, arr.length - 1);
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {

        if (left >= right)
            return;

        int mid = (right + left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int M[] = new int[n2];

        // fill the left and right array
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            M[j] = arr[mid + 1 + j];

        // Maintain current index of sub-arrays and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = left;

        // Until we reach either end of either L or M, pick larger among
        // elements L and M and place them in the correct position at A[p..r]
        // for sorting in descending
        // use if(L[i] >= <[j])
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = M[j++];
            }
        }

        // When we run out of elements in either L or M,
        // pick up the remaining elements and put in A[p..r]
        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = M[j++];
        }

    }

}
