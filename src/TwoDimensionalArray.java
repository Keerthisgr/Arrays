public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int [3][4];
        int count = 1;
        for(int row=0; row<array.length; row++){
            for(int column=0; column<array[row].length; column++){
                array[row][column] = count;
                count++;
            }
        }
        for(int val=0; val<array.length; val++){
            for(int val1=0; val1<array[val].length; val1++){
                System.out.print(array[val][val1]+" ");
            }
            System.out.println("");
        }
    }
}
