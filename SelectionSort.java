public class SelectionSort implements Sorts{

    private int[] myArr;
    private int len;
    
    public SelectionSort(int[] unsortedArr){
        myArr = unsortedArr;
        len = myArr.length;
    }
    public SelectionSort(){
           
    }
    
    private void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public void sort(int[] arr){
        int temp = arr[0];
        for(int i = 0; i<arr.length; i++)
            for(int j = i+1; j<arr.length; j++)
                if(arr[j]<arr[i])
                   swap(arr, i, j);
                   
      myArr = arr;
    }

    
}