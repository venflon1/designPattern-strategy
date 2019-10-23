package it.ra.esempiostrategy2;

public class InsertionSortStrategy implements Strategy{

	@Override
	public int[] sort(int[] array) {
		for(int i = 1; i < array.length; i++) 
		{
			int x = i;
	        int j = i-1;
	        for(; j >= min(array); j--) 
	        {
	        	//Scambiamo l'elemento in posizione x fino a quando non raggiunge
	            //la posizione corretta nel sotto-vettore, cioé quando
	            //non é verificata piú questa condizione
	            if(array[j]>array[x]) 
	            {
	            	int k = array[x];
	                array[x] = array[j];
	                array[j] = k;
	                x = j; //La sua nuova posizione nel sotto-vettore
	            } 
	            else 
	            	break; //Significa che l'i-esimo elemento è nella sua giusta posizione
	                             //quindi possiamo terminare l' iterazione
	        }
	   }
		
		return array;
	}
	
	public int min(int[] array)
	{
		int min = 0;
		if(array.length > 0)
		{
			min = array[0];
			for(int i=1; i<array.length; i++)
			{
				if(min > array[i])
					min = array[i];
			}
		}
		
		return min;
	}

	


}
