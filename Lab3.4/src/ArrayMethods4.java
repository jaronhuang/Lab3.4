import java.util.Arrays;

public class ArrayMethods4 
{
	public static void main(String[] args)
	{
		int[] list = {1, 7, 4, 3, 8, 2, 9}; //4, 3, 8, 2, 9
		partition(list, 2, 7);
	}
	
	public static int partition(int[] list1,int front,int back)
	{
		int pivotPos = (front + back)/2;
		
		boolean isPartition = false;
		while(!isPartition)
		{
			isPartition = true;
		
			for(int i = 0; i < pivotPos; i++)
			{
			
				if(list1[i] > list1[pivotPos])
				{
					isPartition = false;
					swap(list1, i, pivotPos);
					pivotPos = i;
	
				}
				if(i == pivotPos)
				{
					break;
				}
			}
		}
		for(int j = back; j > pivotPos; j--)
		{
			
			if(list1[j] < list1[pivotPos])
			{
				isPartition = false;
				swap(list1, j, pivotPos);
				pivotPos = j;

			}
			if(j == pivotPos)
			{
				break;
			}
		}
		return pivotPos;
	}

	
	public static void quickSort(int[] list1, int front, int back)
	{
		if(front == back)
		{
			printArray(list1);
		}
		else
		{
			quickSort(list1, partition(list1, front, back), back);
			quickSort(list1, front, partition(list1, front, back));
		}
	}
	
	

	/**
	 * Swaps the position of two integers
	 * @param arr Array of integers
	 * @param i Index of the first integer you want to swap
	 * @param j Index of the second integer you want to swap
	 */
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	/**
	 * Prints out each element of the array
	 * @param arr Array of integers
	 */
	public static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
