public class Employee
{
	private String fName;
	private String lName;
	private double salary;
	
	public Employee(String fName , String lName , double salary)
	{
		this.fName = fName;
		this.lName = lName;
		if(salary > 0.0)
			this.salary = salary;
	}
	public void salary(double salaryAmount)
	{
		if(salaryAmount>0.0)
			salaryAmount = salaryAmount*12;
	}
	
	public void setFName(String fName)
	{
		this.fName = fName;
	}
	public String getFName(String fName)
	{
		return fName;
	}
	public void setLName(String lName)
	{
		this.lName = lName;
	}
	public String getLName(String lName)
	{
		return lName;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
	
	
}