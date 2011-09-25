public class QuickSort implements Sorts{
	
	private int[] arr;
	private int len;
	
	public QuickSort(){
	}
	
	public void display(){
		for(int i = 0; i < len; i++)
			if(i != len - 1) 	System.out.print(myArr[i] + ", ");
			else 				System.out.println(myArr[i]);
	}
	
	public void sort(int[]a){
		len = a.length;
		qsort(arr, 0, len-1);
		myArr = arr;
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