public class Array {
    public static void main(String[] args) {
        int arr[] = new int[6];
        int count = 1;
        for(int row=0; row<arr.length; row++){
            arr[row] = count;
            count++;
        }
        for(int val=0; val<arr.length; val++){
            System.out.print(arr[val]+" ");
        }
    }
}
