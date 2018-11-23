package sorts;

public class sorts {

    public void Insertion_sort(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int x = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > x) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = x;
        }
    }

    public void Selection_sort(int arr[]) {
        int j = 0;
        int len = arr.length;
        while (j < len) {
            int index = 0;
            for (int i = 1; i < len - j; i++) {
                if (arr[i] >= arr[index])
                    index = i;
            }
            int temp = arr[len - j - 1];
            arr[len - j - 1] = arr[index];
            arr[index] = temp;
            j++;
        }
    }

    public void print(int arr[]){
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public void BubbleSort(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
    private int partition(int arr[], int L, int R) {
        int pivot = arr[R];
        int i = L - 1;
        for (int j = L; j <= R - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                int a = arr[i];
                arr[i] = arr[j];
                arr[j] = a;
            }
        }
        int b = arr[i + 1];
        arr[i + 1] = arr[R];
        arr[R] = b;

        return i + 1;
    }
    public void QuickSort(int arr[], int L, int R) {
        if(R > L) {
            int q = this.partition(arr, L, R);
            QuickSort(arr, L, q - 1);
            QuickSort(arr, q + 1, R);
        }
    }

    private void Merge(int arr[], int L[], int R[]) {
        int i = 0, j = 0, k = 0;
        int lenArr = arr.length;
        int lenL = L.length;
        int lenR = R.length;
        while (i < lenL && j < lenR) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            }else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < lenL) {
            arr[k] = L[i];
            k++; i++;
        }
        while (j < lenR) {
            arr[k] = R[j];
            k++; j++;
        }
    }
    public void MergeSort(int arr[]) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int L[] = new int [mid];
            for (int i = 0; i < mid; i++)
                L[i] = arr[i];
            int R[] = new int [arr.length - mid];
            for (int j = 0; j < arr.length - mid; j++)
                R[j] = arr[j + mid] ;
            MergeSort(L);
            MergeSort(R);
            this.Merge(arr, L, R);
        }
    }
    public void HeapSort(int arr[]) {
        int len = arr.length;
        for (int i = this.parent(len); i >= 0; i--)
            heapify(arr, len, i);
        for (int i = len - 1; i >= 0; i--) {
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            this.heapify(arr, i, 0);
        }
    }
    private int parent(int x) {
        if(x % 2 == 1) {
            return x / 2;
        } else {
            return  (x/2) - 1;
        }
    }

    private int left(int x) {
        return (2 * x) + 1;
    }

    private int right(int x) {
        return (2 * x) + 2;
    }

    private void heapify(int arr[], int len, int i) {
        int small = i;
        int l = this.left(i);
        int r = this.right(i);
        if (l < len && arr[l] > arr[small]) small = l;
        if (r < len && arr[r] > arr[small]) small = r;
        if (small != i) {
            int tmp = arr[i];
            arr[i] = arr[small];
            arr[small] = tmp;
            heapify(arr, len, small);
        }
    }
}
