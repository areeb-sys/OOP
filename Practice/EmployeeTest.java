public class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee("Haseeb","Ahmed",50000.00);
		Employee e2 = new Employee("Sumeed","Ali",60000.00);
		
		System.out.printf("%s %s Salary : $%.2f%n%n",e1.getFName(),e1.getLName(),e1.getSalary());
		
		
	}
	
}