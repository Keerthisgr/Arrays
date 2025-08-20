public class Largest {
    public static void main(String[] args) {
        int arr[] = {10, 5, 20, 8, 12};
        int val = arr[0];
        for(int num=1;num<arr.length;num++){
            if(val<arr[num]){
               val = arr[num];
            }
        }
        System.out.println("Largest element is "+val);
    }
}
