public class QuickSort implements Sorts{
	
	private int[] myArr;
	private int len;
	
	public QuickSort(int[] unsortedArr){
		myArr = unsortedArr;
		len = myArr.length;
	}
	
	public void display(){
		for(int i = 0; i < len; i++)
			if(i != len - 1) 	System.out.print(myArr[i] + ", ");
			else 				System.out.println(myArr[i]);
	}
	
	public void sort(int[] a, boolean save){
		int arr[];
				
		if(save)
            arr = myArr;
        else {
            arr = a;
        }
        
		qsort(arr, 0, len-1);
		if (save) {
			myArr = arr;
		}
	}
	
	private void swap(int[]arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void qsort(int[]arr, int beginning, int end){
		
		if(beginning >= end) return;
		
		int i = beginning;
		int j = end;
		int pivot = (beginning + end)/2;
		
		while(i <= j) {
			
			while(arr[i] < arr[pivot]) {
				i++;
			}	
			while(arr[j] > arr[pivot]) {
				j--;
			}
			
		if(i <= j){
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		
		qsort(arr, beginning, j);
		qsort(arr, i, end);
	}
}