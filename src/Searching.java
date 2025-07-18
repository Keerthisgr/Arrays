public class Searching {
    public static int search(int array[],int key){
        for(int val=0;val<array.length;val++){
            if(array[val]==key){
                return val;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] =  new int[] {9,7,6,5,0,34,98,67};
        int result = search(arr,6);
        if(result==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index "+result);
        }
    }
}
