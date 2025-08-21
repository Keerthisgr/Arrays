public class ReverseNumber {
        public static void main(String[] args) {
            int arr[] = {10, 20, 30, 40, 50};
            int n = arr.length;
            int reversed[] = new int[n];

            for (int i = 0; i < n; i++) {
                reversed[i] = arr[n - 1 - i];
            }

            for (int num : reversed) {
                System.out.print(num + " ");
            }
        }
}
