package it.ra.esempiostrategy2;

public class QuickSortStrategy implements Strategy {

	@Override
	public int[] sort(int[] array) 
	{
		for (int i = 0; i < array.length - 1; i++)  
		{  
			int index = i;  
	        for (int j = i + 1; j < array.length; j++)
	        {  
	        	if (array[j] < array[index]) 
	        		index = j;//searching for lowest index  
	        }  
	           
	        int smallerNumber = array[index];   
	        array[index] = array[i];  
	        array[i] = smallerNumber;  
		}  
		
		return array;
	}
}
