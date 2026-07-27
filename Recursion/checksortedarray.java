public class checksortedarray {
    static boolean isSorted(int[] arr) {
        return fun(arr, 0, arr.length);
    }

    static boolean fun(int[] a, int i, int n) {
        if (i == n || i == n - 1) {
            return true;
        }
        if (a[i] > a[i + 1]) {
            return false;
        }
        return fun(a, i + 1, n);
    }
}
