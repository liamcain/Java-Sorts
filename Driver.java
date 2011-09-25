import java.util.Scanner;

public class Driver {
	
	public static void displayArr(int[] a){
		int len = a.length;
		for(int i = 0; i < len; i++){
			if(i != len-1) 
				System.out.print(a[i] + ", ");
			else 
				System.out.print(a[i]);
		}
		System.out.println();
	}
	
	public static void manageSort(Sorts sorter, String name){
		final int REPEATS = 1000;
		final int ARRSIZE = 1000;
		int[] randomArr = arrGen(ARRSIZE);
		int[] copy = null;
		Stopwatch stopwatch = new Stopwatch();
		
		stopwatch.start();
		System.out.println("\n===============" + name + "================");
		
		if (ARRSIZE <= 10)//If the arr size is too big, please don't print it all
			displayArr(randomArr);
		
		for (int i = 0; i < REPEATS; i++){
			copy = copyArr(randomArr);
			sorter.sort(copy);
		}
		
		stopwatch.stop();
			
		if (ARRSIZE <= 10)//If the arr size is too big, please don't print it all
			displayArr(copy);
			
		double time = stopwatch.getElapsedTime();
		System.out.println(name + " finished " + REPEATS + " repetitions in " + time + " milliseconds");
		
	}
	
	public static int[] arrGen(int howBig){
		int[] arr = new int[howBig];
		
		for (int i = 0; i < howBig; i++) {
			arr[i] = (int)(Math.random() * 100);
		}
		
		return arr;
	}
	
	public static int[] copyArr(int[] arr){
		int len = arr.length;
		int[] newArr = new int[len];
		
		for(int i = 0; i < len; i++)
			newArr[i] = arr[i];
			
		return newArr;
	}
	
	public static void main(String[] args) {
		
		QuickSort quicksorter = new QuickSort();		
		SelectionSort selectionsorter = new SelectionSort();
		Bubble bubblesorter = new Bubble();

						
		/*==== QuickSort ========*/
		manageSort(quicksorter, "QuickSort");
		
		/*==== Selection Sort =====*/
		manageSort(selectionsorter, "Selection Sort");

		/*==== Bubble Sort =====*/
		manageSort(bubblesorter, "Bubble Sort");

	}
}