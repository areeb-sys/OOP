import java.util.Scanner;
public class cl1{
	public static void main( String[] args){
		
		Scanner myScan = new Scanner( System.in);
		int n = myScan.nextInt();
		for(int i=0;i<=10;i++)
		{
			System.out.printf(" %d * %d = %d", n,i,(n*i));
			System.out.println();
		}
		
	
	}

}