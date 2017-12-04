
public class Team7SortCompetition 
{
public static void main(String args[]) {
		
	}
	public static int challengeOne(int[] arr)
	{
		for(int i = 0; i < arr.length; i++) 
		{
			
		}
		
	}
	public static int challengeTwo(String[] arr)
	{
		return 0;
		
	}
	public static int challengeThree(int[] arr)
	{
		return 0;
		
	}
	public static int challengeFour(int[][] arr)
	{
		return 0;
		
	}
	public static int challengeFive(int[] arr)
	{
		return 0;
		
	}
	public static int partition(int[] list1,int front,int back ){ 
		int pivot = (front+back)/2;
		boolean partition = false;
		while(!partition)
		{
			partition = true;
		
		for(int i = 0; i < pivot; i++)
		{
			
			if(list1[i] > list1[pivot])
			{
				System.out.println("Pivot: "+list1[pivot]);
				System.out.println(i);
				System.out.println(pivot);
				partition = false;
				System.out.println("Switching: "+list1[i]+" "+list1[pivot]);
				swap(list1, pivot, i);
				pivot = i;

			}
			if(i == pivot)
			{
				break;
			}
		}
		for(int j = back; j > pivot; j--)
		{
			
			if(list1[j] < list1[pivot])
			{
				System.out.println("Pivot: "+list1[pivot]);
				System.out.println(j);
				System.out.println(pivot);
				partition = false;

				System.out.println("Switching: "+list1[j]+" "+list1[pivot]);
				swap(list1, pivot, j);
				pivot = j;

			}
			if(j == pivot)
			{
				break;
			}
		}
	}

		return pivot;
	}
	
	public static void quickSort(int[] list1, int front, int back)
	{
		if(front < back) {
			if(back - front > 1)
			{
				quickSort(list1,front, partition(list1,front, back)/3); 
				quickSort(list1,partition(list1,front, back)/3, back); 
			}
		}
	}
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void printArray2(int[] arr)
	
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("[" + arr[i] + "]");
		}
		System.out.println();
	}

}
