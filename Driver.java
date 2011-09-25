import java.util.Scanner;

public class Driver {
	
	public static void manageSort(int[] a, int num, Sorts sorter, String name){
		final int repeats = 1000;
		Stopwatch stopwatch = new Stopwatch();
		
		stopwatch.start();
		System.out.println("\n===============" + name + "================");
		
		if (num <= 10)//If the arr size is too big, please don't print it all
			sorter.display();
		
		for (int i = 0; i < repeats - 1; i++) //The last sort will save the sort
			sorter.sort(a, (repeats == 1));//if true, saves sorted arr to private instance variable
		
		sorter.sort(a, true); //one last sort that saves the sort
		
		stopwatch.stop();
			
		if (num <= 10)//If the arr size is too big, please don't print it all
			sorter.display();
			
		double time = stopwatch.getElapsedTime();
		System.out.println(name + " finished " + repeats + " repetitions in " + time + " milliseconds");
		
	}
	
	public static boolean askQ(String question){
		Scanner reader = new Scanner(System.in);
		
		System.out.println(question);
		
		return (reader.nextLine().equals("yes")) ?true :false;
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
		final int num = 1000;
		int[] randomArr = arrGen(num);
		QuickSort quicksorter = new QuickSort(copyArr(randomArr));		
		SelectionSort selectionsorter = new SelectionSort(copyArr(randomArr));
						
		/*==== QuickSort ========*/
		manageSort(randomArr, num, quicksorter, "QuickSort");
		
		/*==== Selection Sort =====*/
		manageSort(randomArr, num, selectionsorter, "Selection Sort");
		
	}
}