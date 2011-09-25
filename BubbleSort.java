
public class BubbleSort {

    int[] sortedArr;
    
    public BubbleSort(){

    }
    
    private void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public void sort(int [] arr){
        boolean swapped;
        int len = arr.length;

        do{
            swapped = false;
            for(int i = 0; i < len - 1; i++){ // -1 to accommodate for 2 indices
                if(arr[i] > arr[i+1]){
                    swap(i, i+1);
                    swapped = true;
                }
            }
            
        } while(swapped == true);
            
        sortedArr = arr;  
    }   
}