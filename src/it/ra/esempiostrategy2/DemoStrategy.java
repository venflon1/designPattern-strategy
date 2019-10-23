package it.ra.esempiostrategy2;

public class DemoStrategy {

	private static int[] array= {12, -2, 1, 4, 25, 6, 23, -30, 7, 1};
	
	public static void main(String[] args)
	{
		Context context = new Context( new BubbleSortStrategy() );
		context.executeStrategy(array);
		printArray(array);
		
		context.setStrategy( new QuickSortStrategy() );
		context.executeStrategy(array);
		printArray(array);
		
		context.setStrategy( new InsertionSortStrategy() );
		context.executeStrategy(array);
		printArray(array);
	}
	
	public static void printArray(int[] array)
	{
		System.out.print("[");
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + " ");
		System.out.print("]\n");
	}
}
