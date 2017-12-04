
public class Team7SortCompetition 
{
	public static void main(String args[]) 
	{
		int[] arr1 = {5,1,8,3,9,4,2};
		long temp4 = System.nanoTime();
		challengeOne(arr1);
		temp4 = System.nanoTime() - temp4;
		printArray2(arr1);
		System.out.println(temp4);
	}
	public static int challengeOne(int[] arr)
	{
		quickSort(arr,0,arr.length - 1);
		return arr[arr.length/2];
		
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
				quickSort(list1,front, partition(list1,front, back)); 
				quickSort(list1,partition(list1,front, back), back); 
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
