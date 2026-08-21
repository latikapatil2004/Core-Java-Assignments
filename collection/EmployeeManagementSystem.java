/*1. Employee Management System
Statement
Create an Employee POJO with fields:
employeeId, name, department, salary, experience, location, status
Use Map<Integer, Employee> to build an Employee Management System.
Implement CRUD operations and additional logical operations such as finding the highest-paid employee, department-wise salary analysis, experienced employees, and updating employee salary based on performance.
Explanation
Perform the following operations:
1.Add employee 
2.Display all employees 
3.Find employee by ID 
4.Update employee details 
5.Delete employee 
6.Find highest-paid employee 
7.Find employees having experience greater than 5 years 
8.Calculate department-wise average salary 
9.Find employees whose salary is greater than department average 
10.Give a 10% salary hike to employees having more than 5 years of experience 
11.Display employees department-wise 
Sample Input
101, Rahul, IT, 75000, 6, Pune, ACTIVE
102, Amit, HR, 55000, 3, Mumbai, ACTIVE
103, Sneha, IT, 90000, 8, Pune, ACTIVE
104, Priya, Finance, 70000, 5, Mumbai, ACTIVE
105, Kiran, IT, 65000, 2, Pune, INACTIVE
Expected Output
Highest Paid Employee:
103 - Sneha - 90000

Employees with Experience > 5:
101 - Rahul
103 - Sneha

IT Department Average Salary:
76666.67

Employees earning above department average:
103 - Sneha - 90000

After 10% Salary Hike:
101 - Rahul - 82500
103 - Sneha - 99000  */

class Employee 
{
	private int employeeId;
    private String name;
   private String department;
  private double  salary;
  private int experience;
   private String location;
   private boolean  status;
    Employee()
	{
	}
	Employee(int employeeId,String name,String department,double salary,int experience,String location,boolean status)
	{
		this.employeeId=employeeId;
		this.name=name;
		this.department=department;
		this.salary=salary;
		this.experience=experience;
		this.location=location;
		this.status=status;
	}
	public int getId()
	{
		return employeeId;
	}
	public String getName()
	{
		return name;
	}
	 public String getDepartment()
	 {
		 return department;
	 }
	  public double getSalary()
	  {
		  return salary;
	  }
	  
	  public int getExperience()
	{
		return experience ;
	}
	public String getLocation()
	{
		return location;
	}
	 public boolean getStatus()
	 {
		 return status;
	 }
	  
	



























class EmployeeManagementSystem