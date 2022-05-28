//Authore : Areeb Ahmed FA19_BSE_022
public class S1
{
	public static void main(String[] args)
	{
		int[] arr=new int[100];
		for(int i=0;i<args.length;i++)
		{
			 arr[i]= Integer.parseInt(args[i]);
		}
		int positive=0;
		int negative=0;
		int sum=0;
		double avg=0;
		int counter1=0;
		int counter2=0;
		int counter3=0;
		for(int i =0; i < args.length ; i++)
		{
			if(i>0)
			{
				counter1++;
			}
			if(i<0)
			{
				counter2++;
			}
			if(i==0)
			{
				counter3++;
			}
			sum = sum + arr[i];
			avg = sum/args.length;
			
		}
		System.out.printf("There were %d positive numbers",counter1);
		System.out.printf("There were %d negative numbers",counter2);
		System.out.printf("There were %d zeros",counter3);
		System.out.printf("sum is %d ",sum);
		System.out.printf("The average is %.2f",avg);
		
	}
	
}