import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int arr[] = new int[] {8,9,6,5,7,2,3,1};
        for(int val=0;val<arr.length;val++){
            System.out.print(arr[val]);
        }
        System.out.println();
        Arrays.sort(arr);
        for(int val=0;val<arr.length;val++){
            System.out.print(arr[val]);
        }
    }
}
