public class AddingAllElement {
    public static void main(String[] args) {
        int arr[] = {10,40,67,23,16};
        int sum = 0;
        for(int num : arr){
            sum = sum + num;
        }
        System.out.println("Sum of all the elements "+sum);
    }
}
