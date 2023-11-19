package SortingArray;

public class Array {
    public static void main(String [] args){
        int[] array = {9,7,8,15,3,2};
        
        int n = array.length;
        for(int a = 0; a < n - 1; a++){
            for (int b = 0; b < n - a - 1; b++){
                if(array[b] > array[b+1]){
                
                int temp = array[b];
                array[b] = array[b + 1];
                array[b+1] = temp;
            }
        }
        }
    
    System.out.print("Ascending Order: ");
        for(int value:array){
            System.out.print(value + " ");
}
}
}
