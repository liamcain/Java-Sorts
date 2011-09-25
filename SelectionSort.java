public class SelectionSort implements Sorts{

    private int[] myArr;
    private int len;
    
    public SelectionSort(int[] unsortedArr){
        myArr = unsortedArr;
        len = myArr.length;
    }
    public SelectionSort(){
           
    }
    
    public void display(){
        for(int i = 0; i < len; i++)
            if(i != len - 1)    System.out.print(myArr[i] + ", ");
            else                System.out.println(myArr[i]);
    }
    
    private void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public void sort(int[] a, boolean save){
        int[] arr;
        
        if(save)
            arr = myArr;
        else {
            /*arr = new int[len];
            for(int i = 0; i < len; i++)
                arr[i] = myArr[i];*/
            arr = a;
        }
        
        int temp = arr[0];
        for(int i = 0; i<arr.length; i++)
            for(int j = i+1; j<arr.length; j++)
                if(arr[j]<arr[i])
                   swap(arr, i, j);
                   
        if(save)
            myArr = arr;
    }

    
}