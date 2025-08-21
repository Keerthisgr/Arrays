public class CountEvenOdd
{
        public static void main(String[] args) {
            int arr[] = {10, 5, 20, 8, 13, 7};
            int evenCount = 0;
            int oddCount = 0;

            for (int num : arr) {
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            System.out.println("Even numbers: " + evenCount);
            System.out.println("Odd numbers: " + oddCount);
        }
}


