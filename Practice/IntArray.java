public class IntArray
{
	public static void main(String[] args)
	{
		int[][] array1 = {{1,2,3},{4,5,6}};
		int[][] array2 = {{1,2},{3},{4,5,6}};
		
		System.out.println("Values of array1 by rows are:%n");
		outputArray(array1);
		System.out.println("Values of array2 by rows are:%n");
		outputArray(array2);
		
		
	}
	public static void outputArray(int[][] array)
	{
		for(int row=0;row<array.length;row++)
		{	for(int coloumn =0;coloumn<array[row].length;coloumn++)
				System.out.printf("%d  ",array[row][coloumn]);
			
			System.out.println();
		}
	}
	
	
	
}